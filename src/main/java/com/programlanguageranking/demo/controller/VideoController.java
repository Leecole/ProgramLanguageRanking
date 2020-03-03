package com.programlanguageranking.demo.controller;

import com.programlanguageranking.demo.entity.Video;
import com.programlanguageranking.demo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class VideoController {

    @Autowired
    private VideoService videoService;

    @ResponseBody
    @RequestMapping(value="/ListVideos",method =RequestMethod.GET)
    private Map<String ,Object> Videos(){
        System.out.println("***进入了查询所有视频的control层");
        Map<String ,Object> modelMap=new HashMap<>();
        List<Video> videos=videoService.ListAllVideo();
        System.out.println(videos.toString());
        modelMap.put("Videos",videos);
        return modelMap;
    }

    /**
     * 根据id查询视频，实现视频详情
     * @param index
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/ListVideosById",method =RequestMethod.GET)
    private Map<String ,Object> ListVideosById(@RequestParam int index){
        System.out.println("获取到的id"+index);
        int id=index;
        System.out.println("***进入了查询所有视频的control层");
        Map<String ,Object> modelMap=new HashMap<>();
        Video video=videoService.ListVideoById(id);
        System.out.println(video.toString());
        modelMap.put("Videos",video);
        return modelMap;
    }

    /**
     * 根据关键字查询相应的视频或者集合
     * @param key
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/ListVideosBykeywords",method =RequestMethod.GET)
    private Map<String ,Object> ListVideosByKeywords(@RequestParam String key){
        System.out.println("获取到的关键字keywords:"+key);
        String keyword=key;
        System.out.println("***进入了搜索视频的control层");
        Map<String ,Object> modelMap=new HashMap<>();
        List<Video> video=videoService.SearchByKeyword(keyword);
        System.out.println(video.toString()+"/n");
        modelMap.put("SearchedVideo",video);
        return modelMap;
    }

}
