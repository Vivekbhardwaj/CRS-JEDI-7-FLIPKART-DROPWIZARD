/**
 * 
 */
package com.crs.flipkart.business;

import java.util.ArrayList;

import com.crs.flipkart.bean.Course;
import com.crs.flipkart.bean.Professor;
import com.crs.flipkart.bean.Student;

/**
 * @author HP
 *
 */
public interface ProfessorInterface {
	
	public  ArrayList<Professor> viewProfessorData();
	public  void addProfessordata(Professor professor);
	public  boolean removeProfessordata(int professorId);
	public  void updateProfessordata(Professor professor);
	public ArrayList<Course> viewAvailableCourses();
	
	public ArrayList<Student> viewEnrolledStudents(int professorid, int courseid);
	
	public boolean selectCourse(int professorId, int courseId) ;
	
	public void assignGrade(int studentId, int courseId, float grade);
}
