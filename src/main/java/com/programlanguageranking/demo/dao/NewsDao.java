package com.programlanguageranking.demo.dao;

import com.programlanguageranking.demo.entity.News;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsDao {
    //查询所有的视频
    public List<News> SearchAllNews();
}
