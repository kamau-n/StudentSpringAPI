package com.example.StudentApi.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "Student")
@Table (
        name = "student",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "student_email",
                        columnNames = "email"
                )
        }

)
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName="student_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"

    )

    @Column(
            name = "id",
            updatable = false
    )
    private Integer id;
    @Column(
            name = "name",
            updatable = true,
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;
    @Column(
            name = "email",
            updatable = true,
            nullable = false,
            columnDefinition = "TEXT"


    )
    private String email;
    @Column(
            name = "age",
            updatable = true,
            nullable = false

    )

    private  Integer age;


    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "id"
    )

    private List<Registered> registered;


    public Student() {

    }

    public Student(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;

        this.age = age;
    }

    public Student(String name, String email, Integer age) {
        this.name = name;
        this.email = email;

        this.age = age;
    }








    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }



    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +

                ", age=" + age +
                '}';
    }


}
