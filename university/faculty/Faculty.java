package university.faculty;

import java.util.ArrayList;
import java.util.List;
import university.students.Students;

public class Faculty {
	
	String facName;
	
	int facId;
	
	String course;

	public Faculty(String facName, int facId,String course) {
		this.facName = facName;
		this.facId = facId;
		this.course=course;
		
	}

	public String getFacName() {
		return facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public void setCourse(String course)
	{
		this.course=course;
	}
	public String getCourse()
	{
		return course;
	}
	public int getFacId() {
		return facId;
	}

	public void setFacId(int facId) {
		this.facId = facId;
	}

	public static void display(List <Faculty> faL)
	{
		for(Faculty f1:faL)
		System.out.println("FACULTY ID:"+f1.getFacId()+"\nFACULTY NAME:"+f1.getFacName()+"\nCOURSE"+f1.getCourse()+"\n");
	}

}
