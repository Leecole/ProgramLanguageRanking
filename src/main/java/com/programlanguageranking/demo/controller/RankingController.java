package com.programlanguageranking.demo.controller;

import com.programlanguageranking.demo.entity.LanguageRanking;
import com.programlanguageranking.demo.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class RankingController {

    @Autowired
    private RankingService rankingService;

    /**
     * 排行榜列表查询
     * @return modelMap
     */
    @ResponseBody
    @RequestMapping(value="ListRanking",method =RequestMethod.GET)
    private Map<String ,Object> ListRanking(){
        System.out.println("进入了Controller层");
        Map<String,Object> modelMap=new HashMap<>();
        List<LanguageRanking> rankings=rankingService.ListAllRanking();
        System.out.println("已经获取到了结果集："+rankings.toString());
        modelMap.put("Ranking",rankings);
        return modelMap;
    }

    /**
     * 排行榜语言分类
     * @return modelMap
     */
    @ResponseBody
    @RequestMapping(value="ListAllProName",method =RequestMethod.GET)
    private Map<String ,Object> ListAllProName(){
        System.out.println("进入了Controller层");
        Map<String,Object> modelMap=new HashMap<>();
        List<LanguageRanking> ProNames=rankingService.ListAllProject();
        System.out.println("已经获取到了结果集："+ProNames.toString());
        modelMap.put("ProNames",ProNames);
        return modelMap;
    }


}
