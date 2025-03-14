package com.Studentgr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentUpdateDTO
{
    private int studentId;
    private String studentName;
    private String address;
    private String phone;



    public int getPhoneNo() {
        return 0;
    }
}