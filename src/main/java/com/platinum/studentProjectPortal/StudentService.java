package com.platinum.studentProjectPortal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student get_info(int id){
        return repository.getInfo(id);
    }
    public void addStudent(Student student){
        repository.addStudent(student);
    }
}
