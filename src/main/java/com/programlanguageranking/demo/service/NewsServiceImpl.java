package com.programlanguageranking.demo.service;

import com.programlanguageranking.demo.dao.NewsDao;
import com.programlanguageranking.demo.dao.RankingDao;
import com.programlanguageranking.demo.entity.LanguageRanking;
import com.programlanguageranking.demo.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NewsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    public NewsDao newsDao;

    @Override
    public List<News> ListAllNews() {
        List<News> result=null;
        try{
            result=newsDao.SearchAllNews();
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}

