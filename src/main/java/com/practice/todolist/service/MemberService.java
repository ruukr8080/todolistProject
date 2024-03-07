package com.practice.todolist.service;

import com.practice.todolist.dto.MemberDto;
import com.practice.todolist.mapper.MemberMapper;
import com.practice.todolist.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper mapper;

    public void join(MemberDto memberDto) {
        mapper.join(memberDto);
    }

    public Integer findByEmail(String email) {
        return mapper.findByEmail(email);
    }
    public Member findById(int id) {
        return mapper.findById(id);
    }
}