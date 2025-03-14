package com.Studentgr.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherDTO {

    private int teacherId;
    private String teacherName;
    private String address;
    private int phoneNo;


}
