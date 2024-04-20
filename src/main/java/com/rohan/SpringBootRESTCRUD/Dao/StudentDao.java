package com.rohan.SpringBootRESTCRUD.Dao;

import com.rohan.SpringBootRESTCRUD.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student,Integer> {
}
