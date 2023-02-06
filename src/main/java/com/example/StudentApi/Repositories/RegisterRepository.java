package com.example.StudentApi.Repositories;

import com.example.StudentApi.Entity.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository  extends JpaRepository <Registered,Integer> {



}
