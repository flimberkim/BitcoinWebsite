package com.example.wholewebsite.contact.service;

import com.example.wholewebsite.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ContactService {

    @Autowired
    ContactRepository repo;

    public int insertSubscribe(HashMap<String,String> param){

        return repo.insertSubscribe(param);
    }
    public int insertContact(HashMap<String,String> param){

        return repo.insertContact(param);
    }


}
