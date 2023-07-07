package controller;

import lombok.RequiredArgsConstructor;
import model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/controller")
@RequiredArgsConstructor
public class StudentController {
    private final IStudentService iStudentService;
    @PostMapping("/create")
    public ResponseEntity<?> createStudent(@RequestBody Student student){
        iStudentService.save(student);
        return ResponseEntity.ok().body("Student created successfully");
    }
    @GetMapping
    public List<Student> getAllStudent(){
        return iStudentService.findAll();
    }
}
