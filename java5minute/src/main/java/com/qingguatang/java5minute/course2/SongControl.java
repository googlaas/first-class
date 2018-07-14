package com.qingguatang.java5minute.course2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SongControl {

    @RequestMapping(value="/song")
    public String getSong(@RequestParam(name="id",required = false) String songId,@RequestParam(name="na",required = false)String songName)
    {
        //request==false 指 name值可以为空
        //判断songId的信息
        if(songId==null){
            songId="1";
        }

        if(songName==null){
            songName="1 ";
        }

        if(songName.equals("2")){
            return "course2/name.html";
        }

        if(songId.equals("1"))
        {
            return "course2/1.html";
        }
        else{
            return "course2/Other.html";
        }
    }
}
