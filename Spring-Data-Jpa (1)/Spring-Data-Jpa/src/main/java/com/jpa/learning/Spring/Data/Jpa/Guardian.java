package com.jpa.learning.Spring.Data.Jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
//@Entity
public class Guardian {
	@Column(nullable = false)
	Private String GuardianName;
	@Column(nullable = false)
	private String GuardianEmail;
	@Column(nullable = false)
	private String GuardianMobNo;	

}
