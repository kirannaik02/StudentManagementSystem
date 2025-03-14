package com.Studentgr.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="teacherId",length = 12)
    private int teacherId;

    @Column(name="teacherName",length = 30)
    private String teacherName;

    @Column(name="address",length = 40)
    private String address;

    @Column(name="phoneNo",length = 10)
    private int phoneNo;

    public Teacher() {
    }


    public Teacher(int teacherId, String teacherName, String address, int phoneNo) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Teacher(String teacherName, String address, int phoneNo) {
        this.teacherName = teacherName;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
