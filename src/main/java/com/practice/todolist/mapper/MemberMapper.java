package com.practice.todolist.mapper;

import com.practice.todolist.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MemberMapper {

    void join(MemberDto memberDto);
}
