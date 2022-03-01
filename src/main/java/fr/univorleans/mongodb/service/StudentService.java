package fr.univorleans.mongodb.service;

import fr.univorleans.mongodb.entity.Student;
import fr.univorleans.mongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentbyId(String id) {
     return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(String id) {
         studentRepository.deleteById(id);
        return "Student has been deleted.";
    }
}
