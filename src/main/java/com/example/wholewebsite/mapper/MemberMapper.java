package com.example.wholewebsite.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface MemberMapper {

    //회원가입
    public int insertMember(HashMap<String, String> member);
    //로그인
    public HashMap<String, Object> loginMember(HashMap<String, String> member);

    //예전자산
    public int hadBalance(String email);
    public int moneyBalance(String email);
    public ArrayList<HashMap<String, Object>> havingBalance(String email);
}
