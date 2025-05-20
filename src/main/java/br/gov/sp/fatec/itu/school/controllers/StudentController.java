package br.gov.sp.fatec.itu.school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.itu.school.entities.Student;
import br.gov.sp.fatec.itu.school.services.StudentService;

@RestController //Indica que a classe é um Controller, capaz de atender a chamadas HTTP
@RequestMapping("students") //Define o caminho base para as requisições HTTP
public class StudentController {
    
    @Autowired //Chamada da classe StudentService
    private StudentService service;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student){
        return ResponseEntity.created(null).body(service.save(student));
    }
}
