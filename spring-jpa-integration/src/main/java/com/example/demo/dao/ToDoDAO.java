package com.example.demo.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ToDo;

@Repository
@Transactional

public interface ToDoDAO extends JpaRepository<ToDo, Integer>{
	
	
}





