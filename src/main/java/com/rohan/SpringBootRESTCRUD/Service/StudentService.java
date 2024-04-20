package com.rohan.SpringBootRESTCRUD.Service;

import com.rohan.SpringBootRESTCRUD.Dao.StudentDao;
import com.rohan.SpringBootRESTCRUD.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentService {

    @Autowired
    StudentDao studentDao;
    public Student addStudent(Student student) {
        return (Student) studentDao.save(student);
    }

    public Student updateStudent(Student student){
        return (Student) studentDao.save(student);
    }

    public void deleteStudent(Student student){
        studentDao.delete(student);
    }

    public Student getStudentBYId(int id){
        return (Student) studentDao.findById(id).get();
    }

    public List<Student> getAllStudents(){
        return (List<Student>) studentDao.findAll();
    }


}
