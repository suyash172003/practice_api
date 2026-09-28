package com.example.learning.Service;


import com.example.learning.Model.Rest_Model;
import com.example.learning.Repository.Rest_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Rest_Service {

    @Autowired
    Rest_Repository rest;

    public Rest_Model get(long id) {
        return rest.getAllById(id);
    }

    public void store(Rest_Model model){
        rest.save(model);
    }

}
