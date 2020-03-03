package com.programlanguageranking.demo.dao;


import com.programlanguageranking.demo.entity.LanguageRanking;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankingDao {

   /* @Select("SELECT * FROM PLR ORDER BY priority")*/
    public List<LanguageRanking> SearchAllLanguage();   //遍历排行榜数据

    public List<LanguageRanking> ListAllProjectType();
}
