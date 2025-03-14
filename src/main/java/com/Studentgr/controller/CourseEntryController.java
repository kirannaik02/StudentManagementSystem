package com.Studentgr.controller;


import com.Studentgr.dto.*;
import com.Studentgr.service.CourseService;
import com.Studentgr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//@RestController
//@CrossOrigin
//@RequestMapping("/course")
//public class CourseEntryController {
//
//    @Autowired
//    private CourseService courseService;
//
//    @PostMapping(path = "/save")
//    public String saveCourse(@RequestBody CourseSaveDTO courseSaveDTO) {
//        String coursename = courseService.addCourse(courseSaveDTO);
//        return coursename;
//    }
//
//    @GetMapping("/getAllCourse")
//    public List<CourseDTO> getAllCourse() {
//        List<CourseDTO> allCourse = courseService.getAllCourse();
//        return allCourse;
//    }
//
//    @PutMapping(path = "/update")
//    public String updateCourse(@RequestBody CourseUpdateDTO courseUpdateDTO) {
//        String coursename =courseService.updateCourse(courseUpdateDTO);
//        return coursename;
//    }
//
//    @DeleteMapping(path = "/delete/{id}")
//    public String deleteCourse(@PathVariable(value = "id")int id)
//    {
//        boolean deleteCourse = courseService.deleteCourse(id);
//        return "deleted!!!";
//    }
//}
//
@RestController
@CrossOrigin
@RequestMapping("course")
public class CourseEntryController {

    @Autowired
    private CourseService courseService;


    @PostMapping(path = "/save")
    public String saveCourse(@RequestBody CourseSaveDTO courseSaveDTO)
    {
        String course = courseService.addCourse(courseSaveDTO);
        return course;

    }

    @GetMapping("/getAllCourses")
    public List<CourseDTO> getAllStudents()
    {
        List<CourseDTO> allCourses = courseService.getAllCourse();
        return allCourses;
    }

    @PutMapping(path = "/update")
    public String updateCourse(@RequestBody CourseUpdateDTO courseUpdateDTO)
    {
        String course = courseService.updateCourse(courseUpdateDTO);
        return course;

    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteCourse(@PathVariable(value = "id")int id)
    {
        boolean deleteCourse = courseService.deleteCourse(id);
        return "deletedddddd!!!!";

    }

}