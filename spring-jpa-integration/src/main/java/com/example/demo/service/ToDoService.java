package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.ToDo;

public interface ToDoService {
   
	public List<ToDo> getAllToDos();
	public Optional<ToDo> getToDoById(Integer todoId);
	public ToDo createToDo(ToDo todo);
	public void deleteToDoById(Integer todoId);
	public void deleteAll();
	public List<ToDo> findByToDoName(String todoName);
    public void deleteToDoByName(String todoName);
   
}
