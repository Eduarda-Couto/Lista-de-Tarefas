package com.eduarda.desafiotodolist.controller;

import org.springframework.web.bind.annotation.RestController;
import com.eduarda.desafiotodolist.entity.todo;
import com.eduarda.desafiotodolist.service.TodoServices;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/tasks")
public class TodoController {
    private TodoServices todoServices;
    
    public TodoController(TodoServices todoServices){
        this.todoServices = todoServices;

    }

    @PostMapping
    List<todo> create(@RequestBody todo todo) {
        return todoServices.create(todo);
    }
      
    @GetMapping 
    List<todo> list() {
        return todoServices.list();
    
    }

    @PutMapping
    List<todo> update(@RequestBody todo todo) {
        return todoServices.update(todo);
    }

    @DeleteMapping("{id}")
    List<todo> delete(@PathVariable("id") Long id) {
      return todoServices.delete(id);  

    }



}
