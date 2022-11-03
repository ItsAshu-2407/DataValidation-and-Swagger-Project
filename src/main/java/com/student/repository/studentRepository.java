package com.student.repository;

import com.student.model.studentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface studentRepository extends JpaRepository<studentModel, Integer> {
	@Query(value = "select * from Student where Student_id=?1", nativeQuery = true)
	studentModel findByStudentId(int id);
}
