package com.rohan.SpringBootRESTCRUD.Controller;

import com.rohan.SpringBootRESTCRUD.Model.Student;
import com.rohan.SpringBootRESTCRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return (Student) studentService.addStudent(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return (Student) studentService.updateStudent(student);
    }

    @DeleteMapping
    public void deleteStudent(@RequestBody Student student){
        studentService.deleteStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentBYId(@PathVariable int id){
        return (Student) studentService.getStudentBYId(id);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return (List<Student>) studentService.getAllStudents();
    }

}
