package com.qingguatang.java5minute.course5;

import com.qingguatang.java5minute.course4.model.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class CommentPostControl {

    private static Map<String,List<Comment>> comments=new HashMap<>();

    @RequestMapping(value="/comment/post",method=RequestMethod.POST)
    public String post(@RequestParam(value="songId")String songId,Comment comment)
    {
        Date commentTime=new Date();
        comment.setCommentTime(commentTime);

        //xxx-xxx-xxx-xxx
        comment.setId(UUID.randomUUID().toString());

        comments.computeIfAbsent(songId,k->new ArrayList<>()).add(comment);

        /**List<Comment> res;
         if(comments.containsKey(songId)){
         res=comments.get(songId);
         }else{
         res=new ArrayList<>();
         comments.put(songId,res);
        }

         res.add(comment);*/

        List<Comment> commentList=comments.get(songId);

        Collections.sort(commentList,new Comparator<Comment>() {
            @Override
            public int compare(Comment o1, Comment o2) {
                if(o1.getCommentTime().after(o2.getCommentTime()))
                    return -1;
                return 1;
            }
        });

        return "redirect:/songinfo?songId="+songId;//让页面重新跳转到/songinfo?songId"+songId页面
    }

    public List<Comment> getComments(String songId)
    {
        return comments.get(songId);
    }
}
