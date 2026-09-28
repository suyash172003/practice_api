package com.example.learning.Repository;

import com.example.learning.Model.Rest_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rest_Repository extends JpaRepository<Rest_Model, Long>{
    Rest_Model getAllById(long id);
}
