package university;

import java.util.ArrayList;

import university.courses.Courses;
import university.faculty.Faculty;
import university.students.Students;

public class Main {
	
	public static void main(String[] args)
	{
		ArrayList <Students> studentsList=new ArrayList<>(); 
		ArrayList <Faculty> facultiesList=new ArrayList<>();
		ArrayList <Courses> coursesList=new ArrayList<>();
		
		Courses courses=new Courses("32","BSC MATHS","8","50");
		Courses courses1=new Courses("33","BSC PHYSICS","10","60");
		coursesList.add(courses);
		coursesList.add(courses1);
				
		Students student1=new Students("SATHISH",101,"32","BSC(MATHS)");
		Students student2=new Students("MAHESH",101,"32","BSC(MATHS)");
		studentsList.add(student1);
		studentsList.add(student2);
		
		Faculty faculty1=new Faculty("MUTHUGANESH",12,"BSC MATHS");
		Faculty faculty2=new Faculty("SATHYARAJ",23,"BSC PHYSICS");
		facultiesList.add(faculty1);
		facultiesList.add(faculty2);
		
		Courses.display(coursesList);
		Students.display(studentsList);
		Faculty.display(facultiesList);
		
		
		
		
	}

}
