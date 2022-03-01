package fr.univorleans.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.univorleans.mongodb.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

	List<Student> findByName(String name);
	
	Student findByEmailAndName (String email, String name);
	
	Student findByNameOrEmail (String name, String email);
	
	List<Student> findByDepartmentDepartmentName(String deptname);
	
	List<Student> findBySubjectsSubjectName (String subName);
	
	List<Student> findByEmailIsLike (String email);
	
	List<Student> findByNameStartsWith (String name);
}
