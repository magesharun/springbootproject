package com.jsp.todoappproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jsp.todoappproject.service.ToDoService;

@Controller
public class ToDoController
{
	@Autowired
	private ToDoService service;
	
	@GetMapping({"/","viewToDoList"})
	public String ViewAllToItems(Model model,@ModelAttribute("message" ) String message)
	{
		model.addAttribute("list",service.getAllToDoItems());
		model.addAttribute("message",message);
		System.out.println("hello");
		return "viewToDoList";
	
		
	}

}
