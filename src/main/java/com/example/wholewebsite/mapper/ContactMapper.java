package com.example.wholewebsite.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Mapper
public interface ContactMapper {
    public int insertSubscribe(HashMap<String, String> param);
    public int insertContact(HashMap<String, String> param);
}
