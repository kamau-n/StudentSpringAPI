package com.example.StudentApi.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(
        name = "Unit"
)
@Table(

        name = "unit",
        uniqueConstraints =  {
                @UniqueConstraint(
                        name = "unit_id",
                        columnNames = "unitCode"
                )
        }




)
public class Unit {
    @Id

    @SequenceGenerator(
            sequenceName = "unit_sequence",
            name = "unit_sequence",
            allocationSize = 1,
            initialValue = 100

    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "unit_sequence"

    )

    @Column (
            name = "id",
            nullable = false,
            updatable = false
    )
    private String id;


    @Column (
            name = "unitCode",
            nullable = false,
            updatable = true
    )
    private  String unitCode;


    @Column (
            name = "name",
            nullable = false,
            updatable = true



    )
    private  String name;


    @Column (
            name = "teacher",
            nullable = false,
            updatable = true
    )


    public String  teacher;




    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "units_id",
            referencedColumnName = "id"
    )
    private  List<Registered> registered;


    public Unit(String id, String unitCode, String name, String teacher) {
        this.id = id;
        this.unitCode = unitCode;
        this.name = name;
        this.teacher = teacher;

    }

    public Unit(String unitCode, String name, String teacher) {
        this.unitCode = unitCode;
        this.name = name;
        this.teacher = teacher;
    }

    public  Unit(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitId) {
        this.unitCode = unitCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
