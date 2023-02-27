package com.platinum.studentProjectPortal;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController()
public class StudentController {
   Map<Integer,Student> db = new HashMap<>();  //database

   @GetMapping("/get_info")
   Student getStudent(@RequestParam("id") int admnNo) {
       return db.get(admnNo);
   }
   @PostMapping("/add")
   String addStudent(@RequestBody() Student student){
       db.put(student.getAdmnNo() , student);
       return "Student detail added successfully";
   }
   @DeleteMapping("/delete/{id}")
    String deleteStudent(@PathVariable("id") int admnNo){
       db.remove(admnNo);
       return "Student deleted";
   }
}
