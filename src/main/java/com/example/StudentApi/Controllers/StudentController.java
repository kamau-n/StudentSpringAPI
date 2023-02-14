package com.example.StudentApi.Controllers;

import com.example.StudentApi.Entity.Message;
import com.example.StudentApi.Entity.Student;
import com.example.StudentApi.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(path="api/v1/student")
public class  StudentController {

    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService= studentService;
    }
    @GetMapping
    public List<Student> getStudents() {
        return  studentService.getStudents();
    }

    @PostMapping
    public String addStudent(@RequestBody  Student student) {
         return studentService.addStudent(student);
    }

    @DeleteMapping(path ="{studentId}" )
    public void deleteStudent( @PathVariable("studentId") Integer studentId) {
        studentService.deleteStudent(studentId);
    }

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId){
        return studentService.getStudent(studentId);

    }

    //Register a student



}