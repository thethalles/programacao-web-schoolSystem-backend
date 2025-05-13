package br.gov.sp.fatec.itu.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.itu.school.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
