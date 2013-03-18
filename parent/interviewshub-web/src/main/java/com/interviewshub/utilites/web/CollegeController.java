/**
 * 
 */
package com.interviewshub.utilites.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.interviewshub.utilites.core.CollegeService;
import com.interviewshub.utilities.dao.data.College;
import com.interviewshub.utilities.dao.data.Company;

/**
 * @author IB0729
 *
 */
@Controller
@RequestMapping(value = "/college")
public class CollegeController extends MultiActionController {
	@Autowired
	private CollegeService collegeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getCreateCollegeForm(Model model) {
		model.addAttribute(new College());
		System.out.println("get form..");
		return "college/createCollegeForm";
	}
	
	
	@RequestMapping(value = "/addcollege", method = RequestMethod.POST)
	public ModelAndView addCollege(@ModelAttribute("college")College college){
		ModelAndView modelAndView = new ModelAndView("college/createCollegeForm");
		try {
			System.out.println("add col.."+college.getCollegeContactEmail());
			collegeService.addCollegeInfo(college);
			modelAndView.addObject("message", "Record added successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}

	
	
}
