package com.student.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class studentDTO {
	@NotNull(message = "id cannot be null please enter studentid")
	private int studentId;
	@NotNull(message = "username cannot be null please enter username ")
	private String studentName;
	@Pattern(regexp = "[0-9]{10}")
	private String studentPhone;
	@Email
	private String studentEmail;
	@Pattern(regexp = "[a-zA-Z0-9@#]{5,15}")
	private String studentPassword;
}
