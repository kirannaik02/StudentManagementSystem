package com.Studentgr.controller;

import com.Studentgr.dto.StudentDTO;
import com.Studentgr.dto.StudentSaveDTO;
import com.Studentgr.dto.StudentUpdateDTO;
import com.Studentgr.entity.Student;
import com.Studentgr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentEntryController {
    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/save")
    public String saveStudent(@RequestBody StudentSaveDTO studentSaveDTO) {
        String stname = studentService.addStudent(studentSaveDTO);
        return stname;
    }

    @GetMapping("/getAllStudent")
    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> allStudents = studentService.getAllStudent();
        return allStudents;
    }

    @PutMapping(path = "/update")
    public String updateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO) {
        String stname = studentService.updateStudent(studentUpdateDTO);
        return stname;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteStudent(@PathVariable(value = "id")int id)
    {
        boolean deleteStudent = studentService.deleteStudent(id);
        return "deleted!!!";
    }
}