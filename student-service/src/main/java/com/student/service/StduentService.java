package com.student.service;

import com.student.model.Student;
import com.student.wrapper.StudentWrapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StduentService {

    public List<Student> getAllStudent()
    {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Pratik","Dhule"));
        studentList.add(new Student(1,"Pankaj","Pune"));
        studentList.add(new Student(1,"Abhishek","Dhule"));
        studentList.add(new Student(1,"Amol","chalisgoan"));
        return studentList;

    }
}
