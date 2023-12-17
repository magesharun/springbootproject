package com.jsp.todoappproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.todoappproject.model.ToDo;
import com.jsp.todoappproject.repository.ToDoRepository;

@Service
public class ToDoService 
{
	@Autowired
	private ToDoRepository repo;

	public List<ToDo> getAllToDoItems()
	{
		ArrayList<ToDo>todolist=new ArrayList<ToDo>();
		repo.findAll().forEach(todo->todolist.add(todo));     
		
		return todolist;
	}
	
	public ToDo getToDoItemById(Long Id) {

		return repo.findById(Id).get();

	}
	
	public boolean updateStatus(Long Id)
	{
		ToDo todo=getToDoItemById(Id);
		todo.setStatus("Completed");
		return saveOrUpdateToDoItem(todo);
	}
	
	public boolean saveOrUpdateToDoItem(ToDo todo)
	{
		ToDo updatedObj=repo.save(todo);
		if(getToDoItemById(updatedObj.getId())!=null)
		{
			return true;
		}
		return false;
		
	}
	
	boolean deleteToDoItem(Long Id)
	{
		repo.deleteById(Id);
		if(repo.findById(Id).isEmpty())
		{
			return true;
		}
		return false;
	}
	
	
	//update
	//save
	//delete
	

}
