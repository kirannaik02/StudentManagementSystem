package com.Studentgr.repo;

import com.Studentgr.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {



}
