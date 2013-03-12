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
@Table(name = "Company")
public class Company implements Serializable {
	@Id
	@Column(name = "COMPANY_ID")
	@GeneratedValue
	private Long companyId;
	
	@Column(name="COMPANY_NAME")
	private String companyName;

	@Column(name="CONTACT_PERSON")
	private String companyContact;

	@Column(name="CONTACT_EMAIL")
	private String companyEmail;
	
	@Column(name="CONTACT_PHONE")
	private String conpanyContact;

	@Column(name="COMPANY_PASSWORD")
	private String companyPassword;

	/**
	 * @return the companyId
	 */
	public Long getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the companyContact
	 */
	public String getCompanyContact() {
		return companyContact;
	}

	/**
	 * @param companyContact the companyContact to set
	 */
	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}

	/**
	 * @return the companyEmail
	 */
	public String getCompanyEmail() {
		return companyEmail;
	}

	/**
	 * @param companyEmail the companyEmail to set
	 */
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	/**
	 * @return the conpanyContact
	 */
	public String getConpanyContact() {
		return conpanyContact;
	}

	/**
	 * @param conpanyContact the conpanyContact to set
	 */
	public void setConpanyContact(String conpanyContact) {
		this.conpanyContact = conpanyContact;
	}

	/**
	 * @return the companyPassword
	 */
	public String getCompanyPassword() {
		return companyPassword;
	}

	/**
	 * @param companyPassword the companyPassword to set
	 */
	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}
	
	
}
