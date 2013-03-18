/**
 * 
 */
package com.interviewshub.utilities.dao;

import org.springframework.dao.DataAccessException;

import com.interviewshub.utilities.dao.data.College;

/**
 * @author IB0729
 *
 */
public interface CollegeDao {
	public void addCollegeInfo(College college) throws DataAccessException;
}
