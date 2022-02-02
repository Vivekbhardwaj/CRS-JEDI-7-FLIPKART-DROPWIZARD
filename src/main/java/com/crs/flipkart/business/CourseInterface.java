/**
 * 
 */
package com.crs.flipkart.business;

import java.util.ArrayList;

import com.crs.flipkart.bean.Course;
import com.crs.flipkart.exceptions.CourseNotDeletedException;
import com.crs.flipkart.exceptions.CourseNotFoundException;

/**
 * @author HP
 *
 */
public interface CourseInterface {
	public String removeCourse(int courseId) throws CourseNotDeletedException;
    public void addCourse(Course course);
    public void updateCourse(Course course) throws CourseNotFoundException;
    public ArrayList<Course> getAllCourses();
    public Course getCourseFromCatalog(int courseId) throws CourseNotFoundException;
}
