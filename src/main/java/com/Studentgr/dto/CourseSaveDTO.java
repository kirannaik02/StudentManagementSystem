package com.Studentgr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CourseSaveDTO {
    private String courseName;
    private String syllabus;
    private String duration;
}
