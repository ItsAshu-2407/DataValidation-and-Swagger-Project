package com.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
public class studentModel {
	@Id
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentEmail;
	private String studentPassword;
}
