package com.Studentgr.service.IMPL;

import com.Studentgr.dto.StudentDTO;
import com.Studentgr.dto.StudentSaveDTO;
import com.Studentgr.dto.StudentUpdateDTO;
import com.Studentgr.entity.Student;
import com.Studentgr.repo.StudentRepo;
import com.Studentgr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {
        Student student=new Student(
                studentSaveDTO.getStudentName(),
                studentSaveDTO.getAddress(),
                studentSaveDTO.getPhoneNo()
        );
        studentRepo.save(student);

        return student.getStudentName();
    }

    @Override
    public List<StudentDTO> getAllStudent() {
         List <Student> getStudents=studentRepo.findAll();
         List<StudentDTO> studentDTOList=new ArrayList<>();
         for(Student student:getStudents)
         {
             StudentDTO studentDTO=new StudentDTO(
                     student.getStudentId(),
                     student.getStudentName(),
                     student.getAddress(),
                     student.getPhoneNo()
             );
             studentDTOList.add(studentDTO);
         }
        return studentDTOList;
    }

    @Override
    public String updateStudent(StudentUpdateDTO studentUpdateDTO) {
        if(studentRepo.existsById(studentUpdateDTO.getStudentId()))
        {
            Student student = studentRepo.getById(studentUpdateDTO.getStudentId());
            student.setStudentName(studentUpdateDTO.getStudentName());
            student.setAddress(studentUpdateDTO.getAddress());
            student.setPhoneNo(studentUpdateDTO.getPhoneNo());
            studentRepo.save(student);
            return student.getStudentName();
        }
        else
        {
            System.out.println("Student ID Not Found");
        }
        return null;
    }

    @Override
    public boolean deleteStudent(int id) {
        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
        }
        else {
            System.out.println("Student ID Not Found");
        }

        return false;
    }
}
