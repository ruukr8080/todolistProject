package com.practice.todolist.service;

import com.practice.todolist.dto.TodoDto;
import com.practice.todolist.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService{

    private final TodoMapper mapper;

    public void add(TodoDto todo) {
        mapper.add(todo);
    }
}
