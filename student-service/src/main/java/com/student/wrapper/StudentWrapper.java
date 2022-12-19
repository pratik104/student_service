package com.student.wrapper;

import com.student.model.Student;

import java.util.List;

public class StudentWrapper {
    private List<Student> studentList ;

    public StudentWrapper(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
