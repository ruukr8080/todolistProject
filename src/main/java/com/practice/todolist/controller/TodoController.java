package com.practice.todolist.controller;


import com.practice.todolist.dto.TodoDto;
import com.practice.todolist.service.TodoService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/todo/add")
    public String add(HttpSession session, Model model) {
        Integer memberId = (Integer) session.getAttribute("memberId");
        if(null != memberId){
            model.addAttribute("memberId", memberId);
        }
        return "todo/add";
    }

    @PostMapping("/todo/add")
    public String addForm(TodoDto todoDto) {
        todoService.add(todoDto);
        return "redirect:/";
    }
}
