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

import com.interviewshub.utilites.core.CompanyService;
import com.interviewshub.utilities.dao.data.Company;

/**
 * @author IB0729
 *
 */
@Controller
@RequestMapping(value = "/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getCreateForm(Model model) {
		model.addAttribute(new Company());
		System.out.println("get form..");
		return "account/createForm";
	}
	
	@RequestMapping(value = "/addcompany", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("company")Company company ){
		try {
			System.out.println("add comp.."+company.getCompanyName());
			companyService.addCompanyService(company);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "account/createForm";
	}
}
