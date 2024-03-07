package com.practice.todolist.mapper;

import com.practice.todolist.dto.MemberDto;
import com.practice.todolist.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    void join(MemberDto memberDto);

    Integer findByEmail(String email);

    Member findById(int id);
}
