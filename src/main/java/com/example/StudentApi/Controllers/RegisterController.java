package com.example.StudentApi.Controllers;

import com.example.StudentApi.Entity.Registered;
import com.example.StudentApi.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "student/register")
public class RegisterController {
    private  final StudentService studentService;

    @Autowired
    public RegisterController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Registered> getRegistered () {
        return studentService.getRegistered();



    }
    @PostMapping
    public void registerUnit(@RequestBody  Registered registered) {
        studentService.registerUnit(registered);

    }

}
