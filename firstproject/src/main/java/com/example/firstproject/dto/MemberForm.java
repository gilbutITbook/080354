package com.example.firstproject.dto;

import com.example.firstproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MemberForm {
    private Long id;
    private String email;
    private String password;
    // MemberForm 생성자와 toString() 메서드 삭제
    public Member toEntity() {
        return new Member(id, email, password);
    }
}
