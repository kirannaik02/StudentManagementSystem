package com.Studentgr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class TeacherUpdateDTO  {
    private int teacherId;
    private String teacherName;
    private String address;
    private String phone;

    public int getPhoneNo() {
        return 0;
    }


}