package com.practice.todolist.dto;


import lombok.Data;

@Data
public class TodoDto {

    private String title;
    private String detail;
    private Integer memberId;

}
