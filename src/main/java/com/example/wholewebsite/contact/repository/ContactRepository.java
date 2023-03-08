package com.example.wholewebsite.contact.repository;

import com.example.wholewebsite.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper mapper;

    public int insertSubscribe(HashMap<String, String> param){
        return mapper.insertSubscribe(param);
    }

    public int insertContact(HashMap<String, String> param){
        return mapper.insertContact(param);
    }
}
