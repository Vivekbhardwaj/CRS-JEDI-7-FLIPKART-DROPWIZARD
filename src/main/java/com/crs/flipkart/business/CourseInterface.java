/**
 * 
 */
package com.crs.flipkart.business;

import java.util.ArrayList;

import com.crs.flipkart.bean.Course;
import com.crs.flipkart.exceptions.CourseAlreadyExists;
import com.crs.flipkart.exceptions.CourseNotDeletedException;
import com.crs.flipkart.exceptions.CourseNotFoundException;

/**
 * @author HP
 *
 */
public interface CourseInterface {
<<<<<<< HEAD
	public String removeCourse(int courseId) throws CourseNotDeletedException;
    public void addCourse(Course course);
=======
	public void removeCourse(int courseId) throws CourseNotDeletedException;
    public void addCourse(Course course) throws CourseAlreadyExists;
>>>>>>> 111ea93b9169c88450d660e9895679f87decdb25
    public void updateCourse(Course course) throws CourseNotFoundException;
    public ArrayList<Course> getAllCourses();
    public Course getCourseFromCatalog(int courseId) throws CourseNotFoundException;
}
