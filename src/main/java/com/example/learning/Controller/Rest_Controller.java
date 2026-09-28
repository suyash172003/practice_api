package com.example.learning.Controller;

import com.example.learning.Model.Rest_Model;
import com.example.learning.Repository.Rest_Repository;
import com.example.learning.Service.Rest_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Rest_Controller {

    @Autowired
    private Rest_Service service;

    @GetMapping("/{id}")
    public ResponseEntity<Rest_Model> get(@PathVariable int id){
        Rest_Model serv=service.get(id);
        return ResponseEntity.ok(serv);
    }

    @PostMapping("/")
    public ResponseEntity<Rest_Model> put(@RequestBody Rest_Model data){
        service.store(data);
        return ResponseEntity.ok(data);
    }
}
