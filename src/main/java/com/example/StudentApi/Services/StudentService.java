package com.example.StudentApi.Services;

import com.example.StudentApi.Entity.Registered;
import com.example.StudentApi.Entity.Student;
import com.example.StudentApi.Entity.Unit;
import com.example.StudentApi.Repositories.RegisterRepository;
import com.example.StudentApi.Repositories.StudentRepository;
import com.example.StudentApi.Repositories.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private  final StudentRepository studentRepository;
    private  final RegisterRepository registerRepository;

    private final UnitRepository unitRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, UnitRepository unitRepository, RegisterRepository registerRepository, RegisterRepository registerRepository1) {
        this.studentRepository=studentRepository;
        this.registerRepository = registerRepository1;
        this.unitRepository = unitRepository;

    }



    public List<Student> getStudents() {
        return  studentRepository.findAll();



    }

    public String addStudent(Student student) {
        System.out.println(student);
//        Optional<Student> studentOptional =studentRepository.findStudentByEmail(student.getEmail());
//        if(studentOptional.isPresent()) {
//            throw new IllegalStateException("email already exists");
//
//        }
//        studentRepository.save(student);
        return  "Student has been created successfully";




    }

    public void deleteStudent(Integer studentId) {
        System.out.println(studentId);
    boolean exist  =   studentRepository.existsById(studentId);
    if(!exist){
        throw new IllegalStateException("student with the id does not exist");
    }
    else  {
       studentRepository.deleteById(studentId);
        System.out.println(" the following student has been deleted");
    }

    }

    public Student getStudent(Integer studentId) {
     boolean exist =  studentRepository.existsById(studentId);
        if(exist) {
            System.out.println(  studentRepository.findStudentById(studentId));
            return  studentRepository.findStudentById(studentId).get();

        }
        else {
           throw  new IllegalStateException("the user does not exists");
        }

    }

    public void registerUnit(Registered registered) {
        System.out.println(registered);
        registerRepository.save(registered);

    }

    public List<Registered> getRegistered() {
        return registerRepository.findAll();




    }

    public List<Unit> getUnits() {
         return unitRepository.findAll();



    }

 public  void addUnit(Unit unit) {
     System.out.println(unit);


    }
}


