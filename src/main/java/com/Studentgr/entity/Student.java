package com.Studentgr.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Controller;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="studentId",length = 12)
    private int studentid;

    @Column(name="studentName",length = 30)
    private String studentName;

    @Column(name="address",length = 40)
    private String address;

    @Column(name="phoneNo",length = 10)
    private int phoneNo;

    public Student() {
    }

    public Student(Integer studentId, String studentName, String address, int phoneNo) {
        this.studentid = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Student(String studentName, String address, int phoneNo) {
        this.studentName = studentName;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Integer getStudentId() {
        return studentid;
    }

    public void setStudent_id(Integer student_id) {
        this.studentid = student_id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentid +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }

    public String getTeacherName() {
        return "";
    }
}
