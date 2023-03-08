package com.example.wholewebsite.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Mapper
public interface CoinMapper {

    public int insertBuy(HashMap<String, String> param);
    public ArrayList<HashMap<String, Object>> selectBuy(String email);
}
