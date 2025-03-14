package com.Studentgr.service;

import com.Studentgr.dto.StudentUpdateDTO;
import com.Studentgr.dto.TeacherDTO;
import com.Studentgr.dto.TeacherSaveDTO;
import com.Studentgr.dto.TeacherUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {

String addTeacher(TeacherSaveDTO teacherSaveDTO);
    List<TeacherDTO> getAllTeachers();

    //List<TeacherDTO> getAllteacher();

    List<TeacherDTO> getAllteachers();

    String updateTeacher(TeacherUpdateDTO teacherUpdateDTO);
    boolean deleteTeacher(int id);

    List<TeacherDTO> getAllteacher();
}
