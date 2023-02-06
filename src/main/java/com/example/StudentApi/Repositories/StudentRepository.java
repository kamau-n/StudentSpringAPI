package com.example.StudentApi.Repositories;

import com.example.StudentApi.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


    Optional<Student> findStudentByEmail(String email);
    Optional<Student> findStudentById(Integer id);
}
