package com.Studentgr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseUpdateDTO {

    private int courseid;
    private String courseName;
    private String syllabus;
    private String duration;
}
