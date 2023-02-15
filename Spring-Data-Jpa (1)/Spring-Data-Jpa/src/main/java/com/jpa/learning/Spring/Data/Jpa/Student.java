package com.jpa.learning.Spring.Data.Jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tbl_student",
		uniqueConstraints = @UniqueConstraint(columnNames = { "email_address" }))
public class Student {
	
	@Id
	 @GeneratedValue(strategy
             = GenerationType.AUTO)
	private long StudentId;
	@Column(nullable = false)
	private String FirstName;
	@Column(nullable = false)
	private String LastName;
	@Column(name = "email_address",
			nullable = false)
	private String EmailId;
	@Column(nullable = false)
	private String GuardianName;
	@Column(nullable = false)
	private String GuardianEmail;
	@Column(nullable = false)
	private String GuardianMobNo;
	
	public Student() {
		
	}
	
	public Student( String firstName, String lastName, String email, String guardianName,
			String guardianEmail, String guardianMobNo) {
		super();
		FirstName = firstName;
		LastName = lastName;
		EmailId = email;
		GuardianName = guardianName;
		GuardianEmail = guardianEmail;
		GuardianMobNo = guardianMobNo;
	}
	
//	public long getStudentId() {
//		return StudentId;
//	}
//	public void setStudentId(long studentId) {
//		StudentId = studentId;
//	}
//	public String getFirstName() {
//		return FirstName;
//	}
//	public void setFirstName(String firstName) {
//		FirstName = firstName;
//	}
//	public String getLastName() {
//		return LastName;
//	}
//	public void setLastName(String lastName) {
//		LastName = lastName;
//	}
//	public String getEmail() {
//		return EmailId;
//	}
//	public void setEmail(String email) {
//		EmailId = email;
//	}
//	public String getGuardianName() {
//		return GuardianName;
//	}
//	public void setGuardianName(String guardianName) {
//		GuardianName = guardianName;
//	}
//	public String getGuardianEmail() {
//		return GuardianEmail;
//	}
//	public void setGuardianEmail(String guardianEmail) {
//		GuardianEmail = guardianEmail;
//	}
//	public String getGuardianMobNo() {
//		return GuardianMobNo;
//	}
//	public void setGuardianMobNo(String guardianMobNo) {
//		GuardianMobNo = guardianMobNo;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [StudentId=" + StudentId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email="
//				+ EmailId + ", GuardianName=" + GuardianName + ", GuardianEmail=" + GuardianEmail + ", GuardianMobNo="
//				+ GuardianMobNo + "]";
//	}
//	
//	
	
	
	
}
