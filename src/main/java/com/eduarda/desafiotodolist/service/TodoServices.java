package com.eduarda.desafiotodolist.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.eduarda.desafiotodolist.entity.todo;
import com.eduarda.desafiotodolist.repository.TodoRepository;

@Service
public class TodoServices {
    private TodoRepository todoRepository; 


    public TodoServices(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<todo> create(todo todo) {
        todoRepository.save(todo);
         return list();
    }
    public List<todo> list() {
        todoRepository.findAll();
        return list();
    }
    
    public List<todo> update(todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }



}
