package com.programlanguageranking.demo.service;

import com.programlanguageranking.demo.dao.VideoDao;
import com.programlanguageranking.demo.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("VideoService")
public class VideoServiceImpl implements  VideoService {

    @Autowired
    public VideoDao videoDao;

    @Override
    public List<Video> ListAllVideo() {
        List<Video> result=null;
        try{
            result=videoDao.SearchAllVideos();
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Video ListVideoById(int videoId) {
        Video result=null;
        try{
            result=videoDao.SearchByVideoId(videoId);
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 关于学习资源的搜索方法
     * @param key
     * @return
     */
    @Override
    public List<Video> SearchByKeyword(String key) {
        List<Video> result=null;
        try{
            result=videoDao.SearchByKeywords(key);
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
