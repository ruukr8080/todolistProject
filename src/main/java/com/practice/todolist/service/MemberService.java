package com.practice.todolist.service;

import com.practice.todolist.dto.MemberDto;
import com.practice.todolist.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
private  final MemberMapper mapper;
    public void join(MemberDto memberDto) {
        mapper.join(memberDto);
    }
}
