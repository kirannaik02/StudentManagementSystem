package com.Studentgr.service.IMPL;

import com.Studentgr.dto.CourseDTO;
import com.Studentgr.dto.CourseSaveDTO;
import com.Studentgr.dto.CourseUpdateDTO;
import com.Studentgr.dto.StudentDTO;
import com.Studentgr.entity.Course;
import com.Studentgr.entity.Student;
import com.Studentgr.repo.CourseRepo;
import com.Studentgr.repo.StudentRepo;
import com.Studentgr.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceIMPL implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public String addCourse(CourseSaveDTO courseSaveDTO) {
        Course course=new Course(
                courseSaveDTO.getCourseName(),
                courseSaveDTO.getSyllabus(),
                courseSaveDTO.getDuration()
        );
        courseRepo.save(course);

        return course.getCourseName();

    }

    @Override
    public List<CourseDTO> getAllCourse() {
        List <Course> getCourse=courseRepo.findAll();
        List<CourseDTO> courseDTOList=new ArrayList<>();
        for(Course course:getCourse)
        {
            CourseDTO courseDTO=new CourseDTO(
                    course.getCourseid(),
                    course.getCourseName(),
                    course.getSyllabus(),
                    course.getDuration()
            );
            courseDTOList.add(courseDTO);
        }
        return courseDTOList;


    }

    @Override
    public String updateCourse(CourseUpdateDTO courseUpdateDTO) {
        if(courseRepo.existsById(courseUpdateDTO.getCourseid()))
        {
            Course course = courseRepo.getById(courseUpdateDTO.getCourseid());
            course.setCourseName(courseUpdateDTO.getCourseName());
            course.setSyllabus(courseUpdateDTO.getSyllabus());
            course.setDuration(courseUpdateDTO.getDuration());
            courseRepo.save(course);
            return course.getCourseName();
        }
        else
        {
            System.out.println("Course ID Not Found");
        }
        return null;
    }

    @Override
    public boolean deleteCourse(int id) {

        if(courseRepo.existsById(id)){
            courseRepo.deleteById(id);
        }
        else {
            System.out.println("course ID Not Found");
        }

        return false;

    }
}