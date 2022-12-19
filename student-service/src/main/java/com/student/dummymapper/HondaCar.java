package com.student.dummymapper;

import org.springframework.stereotype.Component;

@Component
public class HondaCar implements Car{
    @Override
    public void show() {
        System.out.println("Inside Honda car");
    }
}
