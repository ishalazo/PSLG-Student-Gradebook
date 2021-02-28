import java.util.*;
public class Student {
	private String id, course; // Data fields - is accessible to the entire package
	private int numModules;
	private int[] gradebook;

	//Constructor that sets the data fields
	public Student(String id, String course, int numModules) {
		this.id = id;
		this.course = course;
		this.numModules = numModules;
		gradebook = new int[numModules];
	}

	//Access the course data field
	public String getCourse() {
		return course;
	}
	
	//Students can change courses, so you can set a new course for the student
	public void setCourse(String course) {
		this.course = course;
	}
	
	//Student IDs never change so you only need to see it
	public String getId() {
		return id;
	}

	//Number of modules are determined at the instantiation of a Student object
	public int getNumModules() {
		return numModules;
	}
	

	//Set all of the grades
	public void setGradebook(int[] grades) {
		if(grades.length > gradebook.length) return;
		gradebook = grades;
	}

	//Set a grade for a specified module	
	public void setGrade(int moduleIndex, int grade) {
		gradebook[moduleIndex] = grade;
	}

	//Get the average grade of the student
	public double avgGrade() {
		int total = 0;
		for(int i = 0; i < gradebook.length; i++) {
			total += gradebook[i];
		}
		return total/numModules;
	}
	
	//Randomly fill grades - for live
	public void setRandomGrades() {
		for(int i = 0; i < gradebook.length; i++) {
			gradebook[i] = (int) (Math.random()*101);
		}
	}

	public String toString() {
		return "Student ID: " + id + " \nCourse: " + course + " \nGradebook: " + Arrays.toString(gradebook)
		+ "\nAverage Grade: " + avgGrade() + "\n";
	}
}
