package com.jpa.learning.Spring.Data.Jpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.learning.Spring.Data.Jpa.Student;

public interface StudentRepo extends JpaRepository<Student, Long>  {

}
