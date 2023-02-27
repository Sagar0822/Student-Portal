package com.platinum.studentProjectPortal;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
@Autowired     //In this app. multiple methods so, DB copys will be created if multiple user call so
// use autowired & not new keyword used in object
    StudentService service; //object
    @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int admnNo){   //method name can be change or same used b`coz call as per name
        return service.get_info(admnNo);
    }
    @PostMapping("/add")
    String addStudent(@RequestBody() Student student){
        service.addStudent(student);
        return "Added";
    }
}

////without layers
//@RestController()
//public class StudentController {
//   Map<Integer,Student> db = new HashMap<>();  //database
//
//   @GetMapping("/get_info")
//   Student getStudent(@RequestParam("id") int admnNo) {
//       return db.get(admnNo);
//   }
//   @PostMapping("/add")
//   String addStudent(@RequestBody() Student student){
//       db.put(student.getAdmnNo() , student);
//       return "Student detail added successfully";
//   }
//   @DeleteMapping("/delete/{id}")
//    String deleteStudent(@PathVariable("id") int admnNo){
//       db.remove(admnNo);
//       return "Student deleted";
//   }
//}
