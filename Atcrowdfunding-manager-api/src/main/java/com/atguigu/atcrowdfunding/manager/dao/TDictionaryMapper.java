package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.TDictionary;
import java.util.List;

public interface TDictionaryMapper {
    int insert(TDictionary record);

    List<TDictionary> selectAll();
}