package com.jcyepesgarcia.apistudentmanager.controler;

import com.jcyepesgarcia.apistudentmanager.entity.Student;
import com.jcyepesgarcia.apistudentmanager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(studentService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
       Student registeredStudent = studentService.getById(id);
       if(registeredStudent != null)
           return ResponseEntity.status(HttpStatus.OK).body(studentService.getById(id));
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PostMapping
    public ResponseEntity<String> saveStudent(@RequestBody Student student){
        Student registeredStudent = studentService.create(student);
        if(registeredStudent != null)
            return ResponseEntity.status(HttpStatus.CREATED).body("Successfully registered student.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error in the request due to incorrect syntax, missing parameters or because the email is already registered.");
    }

    @PutMapping
    public ResponseEntity<String> updateStudent(@RequestBody Student student){
        Student registeredStudent = studentService.getById(student.getId());
        if(registeredStudent != null) {
            studentService.update(student);
            return ResponseEntity.status(HttpStatus.OK).body("Successfully upgraded student.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The student does not exist in the database.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long id){
        Student registeredStudent = studentService.getById(id);
        if(registeredStudent != null) {
            studentService.delete(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Student record successfully deleted.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The student does not exist in the database.");

    }
}
