package com.programlanguageranking.demo.dao;

import com.programlanguageranking.demo.entity.Video;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoDao {

    //查询所有的视频
    public List<Video> SearchAllVideos();

    //根据id查询某个相关的视频
    public Video SearchByVideoId(int videoId);

    //用于搜索的方法
    public List<Video> SearchByKeywords(String key);
}
