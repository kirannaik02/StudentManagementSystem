package com.Studentgr.repo;

import com.Studentgr.entity.Course;
import com.Studentgr.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {


}
