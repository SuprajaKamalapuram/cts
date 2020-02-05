package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.ToDoDAO;
import com.example.demo.entity.ToDo;
@Service
@EnableTransactionManagement
public class ToDoServiceImpl implements ToDoService {
	
	private ToDoDAO todoDAO;
	@Autowired
	public ToDoServiceImpl(ToDoDAO todoDAO) {
		super();
		this.todoDAO=todoDAO;
	}


	@Override
	@Transactional
	public List<ToDo> getAllToDos() {
		
		return todoDAO.findAll();
	}

	
	@Override
	@Transactional
	public Optional<ToDo> getToDoById(Integer todoId) {
		
		Optional<ToDo> todo=todoDAO.findById(todoId);
		return todo;
	}


	@Override
	public ToDo createToDo(ToDo todo) {
		// TODO Auto-generated method stub
		return todoDAO.save(todo);
	}

}
