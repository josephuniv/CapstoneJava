package com.example.demo1.Services;

import com.example.demo1.model.Student;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service   //@Component
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1,"ssss"));
    }
}
