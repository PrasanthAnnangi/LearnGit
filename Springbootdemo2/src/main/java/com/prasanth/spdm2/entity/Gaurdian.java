package com.prasanth.spdm2.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AttributeOverrides({
		@AttributeOverride(
		name="name",
		column=@Column(name="gaurdian_name")),
		@AttributeOverride(
				name="emailId",
				column=@Column(name="gaurdian_email")),
		@AttributeOverride(
				name="mobile",
				column=@Column(name="gaurdian_mobile"))
		
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Gaurdian {
	
	
	private String name;
	private String emailId;
	private String mobile;

}
