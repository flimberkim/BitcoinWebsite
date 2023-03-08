package com.example.wholewebsite.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Mapper
public interface PointMapper {

    public int insertPoint(HashMap<String, String> point);

    public double checkBalance(String email);

    public ArrayList<HashMap<String, Object>> selectPoint(String email);
}
