package com.student.dummymapper;

import org.springframework.stereotype.Component;

@Component
public class SuzukiCar implements Car{
    @Override
    public void show() {
        System.out.println("Inside Suzuki car");
    }
}
