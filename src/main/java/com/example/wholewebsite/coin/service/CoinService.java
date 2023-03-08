package com.example.wholewebsite.coin.service;

import com.example.wholewebsite.coin.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class CoinService {

    @Autowired
    CoinRepository repo;

    public int insertBuy(HashMap<String, String> param){
        return repo.insertBuy(param);
    }

    public ArrayList<HashMap<String, Object>> selectBuy(String email){
        return repo.selectBuy(email);
    }
}
