package com.example.StudentApi.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (
        name = "student"

)
public class Registered {
    @Id
    @SequenceGenerator(
            name = "units_id",
            sequenceName = "units_id",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy =GenerationType.SEQUENCE,
            generator = "units_id"

    )

    private Integer id;


    private  Long fees;

    public Registered() {

    }

    public Registered(Integer id, Integer studentId, Long fees) {
        this.id = id;

        this.fees = fees;
    }

    public Registered( Long fees) {

        this.fees = fees;
    }





    public Integer getId() {
        return id;
    }


    public Long getFees() {
        return fees;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public void setFees(Long fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Registered{" +
                "id=" + id +

                ", fees=" + fees +
                '}';
    }
}

