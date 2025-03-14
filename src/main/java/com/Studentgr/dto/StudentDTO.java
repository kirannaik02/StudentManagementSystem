package com.Studentgr.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentDTO {


    private Integer studentId;

    private String studentName;

    private String address;

    private int phoneNo;
}
