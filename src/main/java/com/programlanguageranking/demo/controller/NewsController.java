package com.programlanguageranking.demo.controller;

import com.programlanguageranking.demo.entity.News;
import com.programlanguageranking.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class NewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 查询所有的新闻
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/ListNews",method =RequestMethod.GET)
    private Map<String ,Object> News(){
        System.out.println("***微信小程序开始查询所有新闻control层");
        Map<String ,Object> modelMap=new HashMap<>();
        List<News> news=newsService.ListAllNews();
        System.out.println(news.toString());
        modelMap.put("News",news);
        return modelMap;
    }

}
