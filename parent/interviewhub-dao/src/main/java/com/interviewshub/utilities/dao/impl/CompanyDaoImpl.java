/**
 * 
 */
package com.interviewshub.utilities.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.interviewshub.utilities.dao.CompanyDao;
import com.interviewshub.utilities.dao.data.Company;

/**
 * @author IB0729
 *
 */
@Repository("companyDao")
public class CompanyDaoImpl implements CompanyDao {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public void addCompany(Company company) throws DataAccessException {
		this.factory.getCurrentSession().saveOrUpdate(company);
	}

}
