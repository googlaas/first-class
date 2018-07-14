package com.qingguatang.java5minute.course3;

import com.qingguatang.java5minute.course3.model.SongInfo;
import com.qingguatang.java5minute.course4.model.Comment;
import com.qingguatang.java5minute.course5.CommentPostControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SongInfoControl {

    private static Map<String,SongInfo> songInfoMap=new HashMap<>();

    @Autowired
    private CommentPostControl commentPostControl;

    @RequestMapping(value="/songinfo")
    public String index(String songId,ModelMap modelMap){

        if(songId==null)
            songId="35";
        SongInfo songInfo=songInfoMap.get(songId);

        modelMap.addAttribute("song",songInfo);

        List<Comment> comments=commentPostControl.getComments(songId);

        modelMap.addAttribute("comments",comments);

        return "index";
    }

    @RequestMapping(value="/songinfo/get")
    @ResponseBody
    public SongInfo get(String songId)
    {
        return songInfoMap.get(songId);
    }

    @PostConstruct
    public void init()
    {
        SongInfo songInfo=new SongInfo();
        songInfo.setId("35");
        songInfo.setName("Hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Hello");
        songInfo.setCommentCount(20);
        songInfo.setAlbumImg("http://p1.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg?param=130y130");
        songInfo.setLvrics("Hello, it's me <br/>你好吗 是我<br/>I was wondering if after all these years you'd like to meet<br/>");
        songInfoMap.put("35",songInfo);

        songInfo=new SongInfo();
        songInfo.setId("16");
        songInfo.setName("Someone Like You");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Someone Like You");
        songInfo.setCommentCount(40);
        songInfo.setAlbumImg("http://p1.music.126.net/-g2ieFBmoy7T8crwFaAdxQ==/109951163077007716.jpg?param=130y130");
        songInfo.setLvrics("I heard<br/>" +
                "听说<br/>" +
                "That you are settled down<br/>" +
                "你已定下来");
        songInfoMap.put("16",songInfo);
    }
}
