package com.practice.todolist.controller;


import com.practice.todolist.model.Member;
import com.practice.todolist.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController{
    private final MemberService memberService;
    @GetMapping("/")
    public String main(HttpSession session, Model model){
        Integer memberId = (Integer) session.getAttribute("memberId");
        if(memberId != null){
            Member member = memberService.findById(memberId);
            model.addAttribute("member",member);
        }
        return "main";
    }

}
