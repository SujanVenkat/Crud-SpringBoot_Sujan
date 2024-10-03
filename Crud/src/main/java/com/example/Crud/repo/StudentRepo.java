package com.example.Crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Crud.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
