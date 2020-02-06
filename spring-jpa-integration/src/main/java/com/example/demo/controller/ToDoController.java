package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	
	@PostMapping("/todos")
	public ToDo createToDo(@RequestBody ToDo todo)
	
	{	
		todo.setTodoId(0);
		return todoService.createToDo(todo);
	}
	
	@PutMapping("/todos")
	public ToDo updateToDo(@RequestBody ToDo todo)
	
	{	
		return todoService.createToDo(todo);
	}
	@DeleteMapping("/todos/{todoId}")
	public void deleteById(@PathVariable Integer todoId)
	{
		todoService.deleteToDoById(todoId);
	}
	@DeleteMapping("/todos")
	public void deleteAll()
	{
		todoService.deleteAll();
	}
	@GetMapping("/todos/findByToDoName/{todoName}")
	public List<ToDo> findByToDoName(@PathVariable String todoName)
	{
		return todoService.findByToDoName(todoName);
	}
}
