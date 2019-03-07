package com.example.demo.repositories;

import com.example.demo.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {

    Student getStudentByNameIsLike(String name);

    Student getStudentsByPassportNumberNull();

}
