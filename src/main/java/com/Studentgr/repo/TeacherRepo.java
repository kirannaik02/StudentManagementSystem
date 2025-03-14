package com.Studentgr.repo;

import com.Studentgr.entity.Student;
import com.Studentgr.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
