/**
 * 
 */
package com.interviewshub.utilities.dao;

import org.springframework.dao.DataAccessException;

import com.interviewshub.utilities.dao.data.Company;

/**
 * @author IB0729
 *
 */
public interface CompanyDao {
	public void addCompany(Company company) throws DataAccessException;

}
