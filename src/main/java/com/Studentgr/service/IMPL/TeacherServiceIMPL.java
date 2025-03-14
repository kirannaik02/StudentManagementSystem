package com.Studentgr.service.IMPL;

import com.Studentgr.dto.TeacherDTO;
import com.Studentgr.dto.TeacherSaveDTO;
import com.Studentgr.dto.TeacherUpdateDTO;
import com.Studentgr.entity.Teacher;
import com.Studentgr.repo.TeacherRepo;
import com.Studentgr.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceIMPL implements TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    @Override
    public String addTeacher(TeacherSaveDTO teacherSaveDTO) {
        Teacher teacher=new Teacher(
                teacherSaveDTO.getTeacherName(),
                teacherSaveDTO.getAddress(),
                teacherSaveDTO.getPhoneNo()
        );
        teacherRepo.save(teacher);
        return teacher.getTeacherName();
    }

    @Override
    public List<TeacherDTO> getAllTeachers() {
        return List.of();
    }


    @Override
    public List<TeacherDTO> getAllteachers() {
        List <Teacher> getTeacher=teacherRepo.findAll();
        List<TeacherDTO> teacherDTOList=new ArrayList<>();
        for(Teacher teacher:getTeacher)
        {
            TeacherDTO teacherDTO=new TeacherDTO(
                    teacher.getTeacherId(),
                    teacher.getTeacherName(),
                    teacher.getAddress(),
                    teacher.getPhoneNo()
            );
            teacherDTOList.add(teacherDTO);
        }
        return teacherDTOList;
    }

    @Override
    public String updateTeacher(TeacherUpdateDTO teacherUpdateDTO) {
        if(teacherRepo.existsById(teacherUpdateDTO.getTeacherId()))
        {
            Teacher teacher = teacherRepo.getById(teacherUpdateDTO.getTeacherId());
            teacher.setTeacherName(teacherUpdateDTO.getTeacherName());
            teacher.setAddress(teacherUpdateDTO.getAddress());
            teacher.setPhoneNo(teacherUpdateDTO.getPhoneNo());
            teacherRepo.save(teacher);
            return teacher.getTeacherName();
        }
        else
        {
            System.out.println("Teacher ID Not Found");
        }
        return null;
    }

    @Override
    public boolean deleteTeacher(int id) {
        if(teacherRepo.existsById(id)){
            teacherRepo.deleteById(id);
        }
        else {
            System.out.println("Teacher ID Not Found");
        }

        return false;
    }

    @Override
    public List<TeacherDTO> getAllteacher() {
        return List.of();
    }
}
