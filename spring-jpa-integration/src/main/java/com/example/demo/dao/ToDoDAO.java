package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ToDo;

@Repository
@Transactional

public interface ToDoDAO extends JpaRepository<ToDo, Integer>
{


	public List<ToDo> findByToDoName(String todoName);

	public void deleteByName(String todoName);

	
}





