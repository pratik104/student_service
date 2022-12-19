package com.student.dummymapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestMe {

    @Qualifier("hondaCar")
    @Autowired
    Car car ;

    public void showCar()
    {
        car.show();

    }
}
