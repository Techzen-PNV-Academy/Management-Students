package com.student.pnv.repository;

import com.student.pnv.model.Student;

import java.util.List;
import java.util.UUID;

public interface IStudentRepository {
    List<Student> findAll() ;

    Student findById(UUID id) ;

    Student save(Student student) ;

    Student update(UUID id, Student student) ;

    void delete(UUID id) ;
}
