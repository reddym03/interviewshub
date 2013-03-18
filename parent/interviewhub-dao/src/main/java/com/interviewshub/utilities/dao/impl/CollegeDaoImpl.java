/**
 * 
 */
package com.interviewshub.utilities.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.interviewshub.utilities.dao.CollegeDao;
import com.interviewshub.utilities.dao.data.College;

/**
 * @author IB0729
 *
 */

@Repository("collegeDao") 
public class CollegeDaoImpl implements CollegeDao{

	@Autowired
	private SessionFactory factory;
	
	@Override
	public void addCollegeInfo(College college) throws DataAccessException {
		factory.getCurrentSession().saveOrUpdate(college);
	}

}
