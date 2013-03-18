/**
 * 
 */
package com.interviewshub.utilities.dao.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author IB0729
 *
 */
@Entity
@Table(name = "College")
public class College implements Serializable {

	@Id
	@Column(name = "COLLEGE_ID")
	@GeneratedValue
	private Long collegeId;
	
	@Column(name="COLLEGE_NAME")
	private String collegeName;

	@Column(name="CONTACT_PERSON")
	private String collegeContactPerson;

	@Column(name="CONTACT_EMAIL")
	private String collegeContactEmail;
	
	@Column(name="CONTACT_PHONE")
	private String conpanyContactPhone;

	@Column(name="COLLEGE_PASSWORD")
	private String collegePassword;

	/**
	 * @return the collegeId
	 */
	public Long getCollegeId() {
		return collegeId;
	}

	/**
	 * @param collegeId the collegeId to set
	 */
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	/**
	 * @return the collegeName
	 */
	public String getCollegeName() {
		return collegeName;
	}

	/**
	 * @param collegeName the collegeName to set
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/**
	 * @return the collegeContactPerson
	 */
	public String getCollegeContactPerson() {
		return collegeContactPerson;
	}

	/**
	 * @param collegeContactPerson the collegeContactPerson to set
	 */
	public void setCollegeContactPerson(String collegeContactPerson) {
		this.collegeContactPerson = collegeContactPerson;
	}

	/**
	 * @return the collegeContactEmail
	 */
	public String getCollegeContactEmail() {
		return collegeContactEmail;
	}

	/**
	 * @param collegeContactEmail the collegeContactEmail to set
	 */
	public void setCollegeContactEmail(String collegeContactEmail) {
		this.collegeContactEmail = collegeContactEmail;
	}

	/**
	 * @return the conpanyContactPhone
	 */
	public String getConpanyContactPhone() {
		return conpanyContactPhone;
	}

	/**
	 * @param conpanyContactPhone the conpanyContactPhone to set
	 */
	public void setConpanyContactPhone(String conpanyContactPhone) {
		this.conpanyContactPhone = conpanyContactPhone;
	}

	/**
	 * @return the collegePassword
	 */
	public String getCollegePassword() {
		return collegePassword;
	}

	/**
	 * @param collegePassword the collegePassword to set
	 */
	public void setCollegePassword(String collegePassword) {
		this.collegePassword = collegePassword;
	} 
	
}
