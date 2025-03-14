package com.Studentgr.service;

import com.Studentgr.dto.StudentDTO;
import com.Studentgr.dto.StudentSaveDTO;
import com.Studentgr.dto.StudentUpdateDTO;

import java.util.List;

public interface StudentService {
    String addStudent(StudentSaveDTO studentSaveDTO);

    List<StudentDTO> getAllStudent();

    String updateStudent(StudentUpdateDTO studentupdateDTO);

    boolean deleteStudent(int id);
}
