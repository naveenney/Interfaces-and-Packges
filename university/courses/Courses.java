package university.courses;

import java.util.List;

public class Courses {

	String courseCode;
	
	String courseName;
	
	String courseFaculty;
	
	String courseMaxStudents;

	public Courses(String courseCode, String courseName, String courseFaculty, String courseMaxStudents) {
	
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseFaculty = courseFaculty;
		this.courseMaxStudents = courseMaxStudents;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseFaculty() {
		return courseFaculty;
	}

	public void setCourseFaculty(String courseFaculty) {
		this.courseFaculty = courseFaculty;
	}

	public String getCourseMaxStudents() {
		return courseMaxStudents;
	}

	public void setCourseMaxStudents(String courseMaxStudents) {
		this.courseMaxStudents = courseMaxStudents;
	}
	
	public static void display(List <Courses> l)
	{
		for(Courses c:l)
		{
		   System.out.println("COURSE CODE:"+c.getCourseCode()+"\nCOURSE NAME:"+c.getCourseName()+"\nCOURSE FACULTY:"+c.getCourseFaculty()+"\nCOURSEMAXCOUNTS:"+c.getCourseMaxStudents()+"\n");
		}
	}
	
}
