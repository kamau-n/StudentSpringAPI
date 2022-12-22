package com.example.StudentApi.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path="api/v1/student")
public class  StudentController {

    private final  StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService= studentService;
    }
    @GetMapping
    public List<Student> getStudents() {
        return  studentService.getStudents();
    }

    @PostMapping
    public void addStudent( @RequestBody  Student student) {
        studentService.addStudent(student);

    }

    @DeleteMapping(path ="{studentId}" )
    public void deleteStudent( @PathVariable("studentId") Integer studentId) {
        studentService.deleteStudent(studentId);

    }

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId){
        return studentService.getStudent(studentId);

    }
}