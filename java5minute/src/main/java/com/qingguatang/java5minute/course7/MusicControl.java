package com.qingguatang.java5minute.course7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MusicControl {

    private static final Map<String,String> music = new HashMap<>();

    @RequestMapping(value="/song/music")
    @ResponseBody
    public String getMusicSrc(String songId){return music.get(songId);}

    @PostConstruct
    public void init(){
        music.put("35",
                "http://m10.music.126.net/20180714104852/607dad684fe59dbaf02231ca840662b1/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");

        music.put("16",
                "http://m10.music.126.net/20180714113127/d93424b250b05e3ea84b0301d2889e22/ymusic/0cce/0768/52ed/db86bd40d6ba02bc4dc09cc942216662.mp3");
    }

}
