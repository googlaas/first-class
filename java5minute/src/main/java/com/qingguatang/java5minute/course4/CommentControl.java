package com.qingguatang.java5minute.course4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.qingguatang.java5minute.course5.CommentPostControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qingguatang.java5minute.course4.model.Comment;

@Controller
public class CommentControl {

    @Autowired
    private CommentPostControl commentPostControl;

    @RequestMapping(value="/comments")
    public String comments(ModelMap modelMap)
    {

        List<Comment> comments=commentPostControl.getComments("35");

        modelMap.addAttribute("comments",comments);

        return "comments";
    }

    /**private List<Comment> getComment(){
        List<Comment> comments=new ArrayList<>();

        Comment comment=new Comment();
        comment.setIcon("http://p1.music.126.net/xHAQ2seY8igYbjujpSB8Ug==/109951163348615205.jpg?param=50y50");
        comment.setCommentTime(new Date(2015-1900,10,23));
        comment.setLikeNum(20);
        comment.setContent("hello！一转眼四年了！终于等到王者的归来~阿呆的全球屠榜又要开始啦！在此献上我的鸡腿！嘻嘻~");
        comment.setNickName("AriLuv");

        comments.add(comment);

        comment=new Comment();
        comment.setIcon("http://p1.music.126.net/eLZfXg6oY_xqWmd3hzQg-w==/109951163043012263.jpg?param=50y50");
        comment.setCommentTime(new Date(2015-1900,12,13));
        comment.setLikeNum(70);
        comment.setContent("这hello应该翻译成别来无恙更恰当。");
        comment.setNickName("Edawn");

        comments.add(comment);

        return comments;
    }*/

}
