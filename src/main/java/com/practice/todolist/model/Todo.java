package com.practice.todolist.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Todo {

    private Integer id;
    private String title;
    private String detail;
    private Integer memberId ;
    private boolean done;
    private LocalDateTime resisterDt;
    private LocalDateTime updateDt;


}
