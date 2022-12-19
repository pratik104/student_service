package com.student.controller;

import com.student.dummymapper.Bike;
import com.student.dummymapper.TestMe;
import com.student.service.StduentService;
import com.student.wrapper.StudentWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StduentService stduentService;

    @Autowired
    TestMe me;

    @Autowired
    Bike bike;

    @GetMapping("/getallstudent")
    public StudentWrapper getAllStudent()
    {
        StudentWrapper studentWrapper = new StudentWrapper(stduentService.getAllStudent());
        return studentWrapper;
    }
    @GetMapping(value = "/get")
    public void get()
    {
        me.showCar();
        bike.display();

    }

}
