package com.practice.todolist.controller;

import com.practice.todolist.dto.MemberDto;
import com.practice.todolist.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    @GetMapping("/member/join")
    public String join() {

        return "join";
    }

    @GetMapping("/member/login")
    public String login() {

        return "login";
    }
    @PostMapping("/member/join")
    public String joinForm(MemberDto memberDto){
        memberService.join(memberDto);
        return "redirect:/";
    }
    @PostMapping("/member/login")
    public String loginForm(){

        return "redirect:/";
    }
}
