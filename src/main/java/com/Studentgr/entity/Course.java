package com.Studentgr.entity;

import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="courseId",length = 30)
    private int courseid;

    @Column(name="courseName",length = 60)
    private String courseName;

    @Column(name="syllabus",length = 60)
    private String syllabus;

    @Column(name="duration",length = 60)
    private String duration;

    public Course(int courseid, String courseName, String syllabus, String duration) {
        this.courseid = courseid;
        this.courseName = courseName;
        this.syllabus = syllabus;
        this.duration = duration;
    }

    public Course(String courseName, String syllabus, String duration) {
        this.courseName = courseName;
        this.syllabus = syllabus;
        this.duration = duration;
    }

    public Course() {
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", courseName='" + courseName + '\'' +
                ", syllabus='" + syllabus + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

}
