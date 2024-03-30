package university.students;

import java.util.List;

public class Students {
	
	String name;
	
	int StudentId;
	
	String courseId;
	
    String courseName;

	public Students(String name, int studentId, String courseId, String courseName) {
		this.name = name;
		StudentId = studentId;
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public static void display(List <Students> st)
	{
		for(Students s:st)
		{
			System.out.println("STUDENT ID:"+s.getCourseId()+"\nSTUDENT NAME:"+s.getName()+"\nSTUDENT COURSENAME:"+s.getCourseName()+"\n");
		}
	}
    
    

}
