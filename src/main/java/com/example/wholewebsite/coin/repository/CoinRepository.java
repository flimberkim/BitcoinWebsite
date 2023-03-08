package com.example.wholewebsite.coin.repository;

import com.example.wholewebsite.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class CoinRepository {

    @Autowired
    CoinMapper mapper;

    public int insertBuy(HashMap<String, String> param){
        return mapper.insertBuy(param);
    }

    public ArrayList<HashMap<String, Object>> selectBuy(String email){
        return mapper.selectBuy(email);
    }
}
