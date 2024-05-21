package com.eduarda.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduarda.desafiotodolist.entity.todo;

public interface TodoRepository extends JpaRepository<todo, Long> {
    
}
