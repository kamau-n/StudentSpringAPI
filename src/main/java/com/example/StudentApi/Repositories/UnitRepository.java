package com.example.StudentApi.Repositories;

import com.example.StudentApi.Entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository  extends JpaRepository<Unit,Integer> {


}

