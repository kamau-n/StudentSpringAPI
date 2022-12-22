package com.example.StudentApi.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository studentRepository) {
        return  args -> {
           Student kamau = new Student(

                    "Kamau",
                    "kamau@gmail.com",
                    22

            );

           Student kevin = new Student(
                   "kevin",
                   "kevin@gmail.com",
                   23
           );

            Student dan = new Student(
                    "dan",
                    "dan@gmail.com",
                    25
            );

studentRepository.saveAll(
        List.of(kamau,kevin,dan)
);
        };
    }
}
