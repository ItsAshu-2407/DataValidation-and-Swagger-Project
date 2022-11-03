package com.student.service;

import java.util.List;

import com.student.GlobalException.GlobalException;
import com.student.dto.studentDTO;
import com.student.model.studentModel;
import com.student.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class studentService {
	@Autowired
	private studentRepository studentrepo;

	public studentModel addStudent(studentDTO s1) {

		studentModel s2 = studentModel.build(s1.getStudentId(), s1.getStudentName(), s1.getStudentPhone(),
				s1.getStudentEmail(), s1.getStudentPassword());
		return studentrepo.save(s2);
	}

	public List<studentModel> getStudent() {
		return studentrepo.findAll();
	}

	public studentModel deleteStudent(int id) throws GlobalException {

		studentModel s3 = studentrepo.findByStudentId(id);
		if (s3 != null) {
			studentrepo.deleteById(id);
			return s3;
		} else {
			throw new GlobalException("Student not found please enter correct id ");
		}

	}
}
