package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Coffee {
    @Id // 빨간색으로 뜨면 Alt + Enter 누른 후 Id (jakarta.persistence) 임포트
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 생성 전략
    private Long id;
    @Column
    private String name;
    @Column
    private String price;
    public void patch(Coffee coffee) {
        if (coffee.name != null)
            this.name = coffee.name;
        if (coffee.price != null)
            this.price = coffee.price;
    }
}
