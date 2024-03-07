package com.practice.todolist.mapper;

import com.practice.todolist.dto.TodoDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {


    void add(TodoDto todo);

}
