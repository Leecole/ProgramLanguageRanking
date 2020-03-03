package com.programlanguageranking.demo.service;

import com.programlanguageranking.demo.entity.Video;

import java.util.List;

public interface VideoService {
    public List<Video> ListAllVideo();
    public Video ListVideoById(int videoId);
    public List<Video> SearchByKeyword(String key);
}
