package com.revature.spms.todo;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static long idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "angelo", "Learn C#", new Date(), false));
		todos.add(new Todo(++idCounter, "angelo", "Learn Python", new Date(), false));
		todos.add(new Todo(++idCounter, "angelo", "Learn Angular", new Date(), false));
		todos.add(new Todo(++idCounter, "angelo", "Learn C++", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteTodoById(long id){
		Todo todo = findById(id);
		if(todo == null) {
			return null;
		}
		if(todos.remove(todo)) {
			return todo;
		}
		
		return null;
	}

	public Todo findById(long id) {
		for(Todo todo: todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteTodoById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}

}
