package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ToDoDAO;
import com.example.demo.entity.ToDo;

@SpringBootApplication
public class SpringJpaIntegrationApplication implements CommandLineRunner {

	private ToDoDAO todoDAO;
	
	@Autowired
	public SpringJpaIntegrationApplication(ToDoDAO todoDAO) {
		super();
		this.todoDAO = todoDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		todoDAO.save(new ToDo("todo list-1"));
		todoDAO.save(new ToDo("todo list-2"));
		todoDAO.save(new ToDo("todo list-3"));
		todoDAO.save(new ToDo("todo list-4"));
		todoDAO.save(new ToDo("todo list-5"));
		todoDAO.save(new ToDo("todo list-6"));
	
	}

}