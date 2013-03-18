/**
 * 
 */
package com.interviewshub.utilites.web;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csvreader.CsvReader;
import com.interviewshub.utilites.web.form.UploadForm;
import com.interviewshub.utilities.dao.data.Company;

/**
 * @author IB0729
 *
 */
@Controller
@RequestMapping(value = "/upload")
public class FileUploadController {
	 @RequestMapping(method=RequestMethod.GET)
	 public String getUploadForm(Model model) {
			model.addAttribute(new UploadForm());
			System.out.println("get form..");
			return "college/studentUploadForm";
		}
	 
	 @RequestMapping(value = "/create",method = RequestMethod.POST)
	  public String create(UploadForm uploadForm, BindingResult result) {
	    if (result.hasErrors()) {
	      for(ObjectError error : result.getAllErrors()) {
	        System.err.println("Error: " + error.getCode() +  " - " + error.getDefaultMessage());
	      }
	      return "college/studentUploadForm";
	    }
	 
	    // Some type of file processing...
	    System.err.println("-------------------------------------------");
	    System.err.println("Test upload: " + uploadForm.getFilename());
	    System.err.println("-------------------------------------------");
	   
	    try {
			CsvReader bulkUsers = new CsvReader(uploadForm.getFileData().getInputStream(), Charset.defaultCharset());
			bulkUsers.readHeaders();
			String inputUserName = "";
			String inputPassword = "";
			String inputACL = "";
			String inputRoles = "";
			String inputSite = "";

			while (bulkUsers.readRecord()) {
				inputUserName = bulkUsers.get("Network Login Name");
				inputPassword = bulkUsers.get("Password");
				inputACL = bulkUsers.get("ACL");
				inputRoles = bulkUsers.get("Role");
				inputSite = bulkUsers.get("Site");
				System.out.println(inputUserName +" :: " +inputPassword);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	    return "redirect:/app/";
	  }
	 
}
