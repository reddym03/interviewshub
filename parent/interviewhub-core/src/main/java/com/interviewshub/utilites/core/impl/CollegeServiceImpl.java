/**
 * 
 */
package com.interviewshub.utilites.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.interviewshub.utilites.core.CollegeService;
import com.interviewshub.utilities.dao.CollegeDao;
import com.interviewshub.utilities.dao.data.College;

/**
 * @author IB0729
 *
 */
@Service("collegeService")
@Transactional
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	private CollegeDao collegeDao;
	
	@Override
	public void addCollegeInfo(College college) throws Exception {
		collegeDao.addCollegeInfo(college);
	}

}
