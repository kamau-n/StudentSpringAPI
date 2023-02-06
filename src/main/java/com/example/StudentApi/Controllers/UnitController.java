package com.example.StudentApi.Controllers;


import com.example.StudentApi.Entity.Student;
import com.example.StudentApi.Entity.Unit;
import com.example.StudentApi.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "student/units")
public class UnitController {
     private  final StudentService studentService ;

     @Autowired
     public UnitController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Unit> getUnits(){
        return studentService.getUnits();

    }

    @PostMapping
    public  void addUnit(Unit unit) {
         studentService.addUnit(unit);
    }



}
