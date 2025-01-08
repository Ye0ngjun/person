package com.pg.pg.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Getter

public class PersonRequestDto {
    private String name;
    private int age;
    public PersonRequestDto(String name, int age){
        this.name = name;
        this.age = age;
    }

}
