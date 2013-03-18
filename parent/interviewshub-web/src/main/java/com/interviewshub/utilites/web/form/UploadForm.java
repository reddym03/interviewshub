/**
 * 
 */
package com.interviewshub.utilites.web.form;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author IB0729
 *
 */
public class UploadForm {
	private String filename;
	private CommonsMultipartFile fileData;
	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}
	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * @return the fileData
	 */
	public CommonsMultipartFile getFileData() {
		return fileData;
	}
	/**
	 * @param fileData the fileData to set
	 */
	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}
	

}
