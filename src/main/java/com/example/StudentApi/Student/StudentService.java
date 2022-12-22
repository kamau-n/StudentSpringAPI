package com.example.StudentApi.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private  final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }



    public List<Student> getStudents() {
        return  studentRepository.findAll();



    }

    public void addStudent(Student student) {
        System.out.println(student);
        Optional<Student> studentOptional =studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()) {
            throw new IllegalStateException("email already exists");

        }
        studentRepository.save(student);


    }

    public void deleteStudent(Integer studentId) {
        System.out.println(studentId);
    boolean exist  =   studentRepository.existsById(studentId);
    if(!exist){
        throw new IllegalStateException("student with the id does not exist");
    }
    else  {
        throw new IllegalStateException("the following student does exists");
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
}


