package com.Studentgr.controller;

import com.Studentgr.dto.*;
import com.Studentgr.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/teacher")
public class TeacherEntryController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping(path = "/save")
    public String saveTeacher(@RequestBody TeacherSaveDTO teacherSaveDTO) {
        String teachername = teacherService.addTeacher(teacherSaveDTO);
        return teachername;
    }

    @GetMapping("/getAllTeacher")
    public List<TeacherDTO> getAllStudents() {
        List<TeacherDTO> allTeacher = teacherService.getAllteacher();
        return allTeacher;
    }

    @PutMapping(path = "/update")
    public String updateTeacher(@RequestBody TeacherUpdateDTO teacherUpdateDTO)
    {
        String teachername = teacherService.updateTeacher(teacherUpdateDTO);
        return teachername;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteTeacher(@PathVariable(value = "id")int id)
    {
        boolean deleteTeacher = teacherService.deleteTeacher(id);
        return "deleted!!!";
    }
}
