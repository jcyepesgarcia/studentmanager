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

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Optional<Student> getById(Long id){
        return studentRepository.findById(id);
    }

    public boolean saveOrUpdate(Student student){
        Optional<Student> existingStudent = studentRepository.findById(student.getId());
        if(existingStudent.isPresent()){
            studentRepository.save(student);
            return  true;
        }
        return false;
    }

    public boolean delete(Long id){
        Optional<Student> existingStudent = studentRepository.findById(id);
        if(existingStudent.isPresent()){
            studentRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}
