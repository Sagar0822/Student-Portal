package com.platinum.studentProjectPortal;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> db = new HashMap<>(); //database

    public Student getInfo(int id){
        return db.get(id);
    }

    public void addStudent(Student student){
        db.put(student.getAdmnNo(),student);
    }

}
