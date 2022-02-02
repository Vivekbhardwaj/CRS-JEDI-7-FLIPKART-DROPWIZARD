/**
 * 
 */
package com.crs.flipkart.exceptions;

/**
 * Exception to check if course is available in catalog
 * @author JEDI-03
 *
 */
public class CourseNotFoundException extends Exception{
	
	private int courseId;
	
	public CourseNotFoundException(int courseId)
	{
		setCourseId(courseId);
	}
	
	@Override
	public String getMessage() {
		return "The course you are trying to update does not exist. CourseId :"+String.valueOf(courseId);
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
}
