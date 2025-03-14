package com.Studentgr.service;


import com.Studentgr.dto.CourseDTO;
import com.Studentgr.dto.CourseSaveDTO;
import com.Studentgr.dto.CourseUpdateDTO;

import java.util.List;

public interface CourseService {
    String addCourse(CourseSaveDTO courseSaveDTO);

    List<CourseDTO> getAllCourse();

    String updateCourse(CourseUpdateDTO courseUpdateDTO);

    boolean deleteCourse(int id);
}
