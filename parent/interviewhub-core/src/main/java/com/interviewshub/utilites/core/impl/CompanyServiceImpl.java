/**
 * 
 */
package com.interviewshub.utilites.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.interviewshub.utilites.core.CompanyService;
import com.interviewshub.utilities.dao.CompanyDao;
import com.interviewshub.utilities.dao.data.Company;

/**
 * @author IB0729
 *
 */
@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao companyDao;

	@Override
	public void addCompanyService(Company company) throws Exception {
		companyDao.addCompany(company);
	}
}
