package com.example.demo1.controlers;

import com.example.demo1.Services.StudentService;
import com.example.demo1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentControler {

    private final StudentService studentService;

    @Autowired
    public StudentControler(StudentService StudentService) {
        //this.studentService = new StudentService();
        this.studentService = StudentService;
    }

    @GetMapping   // Return List of objects
    public List<Student> getStudents() {
        return studentService.getStudents();

    }

}
