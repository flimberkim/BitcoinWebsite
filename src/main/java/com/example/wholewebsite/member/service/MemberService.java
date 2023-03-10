package com.example.wholewebsite.member.service;

import com.example.wholewebsite.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    MemberRepository repo;

    public int insertMember(HashMap<String, String> member){
        return repo.insertMember(member);
    }

    public HashMap<String, Object> loginMember(HashMap<String, String> member){
        return repo.loginMember(member);
    }

    public int hadBalance(String email){
        return repo.hadBalance(email);
    }

    public int moneyBalance(String email){
        return repo.moneyBalance(email);
    }

    public ArrayList<HashMap<String, Object>> havingBalance(String email){
        return repo.havingBalance(email);
    }
}
