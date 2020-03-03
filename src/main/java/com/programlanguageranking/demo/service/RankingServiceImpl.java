package com.programlanguageranking.demo.service;

import com.programlanguageranking.demo.entity.LanguageRanking;

import com.programlanguageranking.demo.dao.RankingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("RankingService")
public class RankingServiceImpl implements RankingService {

    @Autowired
    public RankingDao rankingDao;

    @Override
    public List<LanguageRanking> ListAllRanking() {

        List<LanguageRanking> result=null;
        try{
            result=rankingDao.SearchAllLanguage();
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<LanguageRanking> ListAllProject() {
        List<LanguageRanking> result=null;
        try{
            result=rankingDao.ListAllProjectType();
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

}

