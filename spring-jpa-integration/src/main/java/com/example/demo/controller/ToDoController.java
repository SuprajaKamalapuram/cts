package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ToDo;
import com.example.demo.error.ErrorMessage;
import com.example.demo.error.ToDoNotFoundException;
import com.example.demo.service.ToDoService;

@RestController
@RequestMapping("/api")

public class ToDoController {
	
	private ToDoService todoService;

	public ToDoController(ToDoService todoService) {
		super();
		this.todoService=todoService;
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError1(ToDoNotFoundException tne)
	{
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(tne.getMessage());
		errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError2(Exception e)
	{
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(e.getMessage());
		errorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.BAD_REQUEST);
	}
	
	
	@GetMapping("/todos")
	public List<ToDo> getAll()
	{
		return todoService.getAllToDos();
	}
	
	@GetMapping("/todos/{todoId}")
	public Optional<ToDo> getToDoById(@PathVariable Integer todoId) throws Exception
	{
		Optional<ToDo> todo=todoService.getToDoById(todoId);
		if(!todo.isPresent())
		{
			throw new ToDoNotFoundException("todo not found with id: "+todoId);
		}
		
		return todo; 
	}
}
