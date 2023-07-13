package com.jcyepesgarcia.apistudentmanager.service;

import com.jcyepesgarcia.apistudentmanager.entity.Student;
import com.jcyepesgarcia.apistudentmanager.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student create(Student student) {
        Student registeredStudent = studentRepository.findByEmail(student.getEmail());
        if (registeredStudent != null)
            return null;
        return studentRepository.save(student);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student update(Student student) {
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        if (existingStudent != null) {
            return studentRepository.save(student);
        }
        return null;
    }

    public boolean delete(Long id){
        Student student = studentRepository.findById(id).orElse(null);
        if(student != null) {
            studentRepository.delete(student);
            return true;
        }
        return false;
    }

}
