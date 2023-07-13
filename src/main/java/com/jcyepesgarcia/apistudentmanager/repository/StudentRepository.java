package com.jcyepesgarcia.apistudentmanager.repository;

import com.jcyepesgarcia.apistudentmanager.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
