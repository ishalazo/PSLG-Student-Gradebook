import java.util.*;
public class Student {
	private String id, course; // Data fields - is accessible to the entire package
	private int numModules;
	private int[] gradebook;
	
	public Student(String id, String course, int numModules) {
		this.id = id;
		this.course = course;
		this.numModules = numModules;
		gradebook = new int[numModules];
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getId() {
		return id;
	}

	public int getNumModules() {
		return numModules;
	}
	
	
	public void setGradebook(int[] grades) {
		if(grades.length > gradebook.length) return;
		gradebook = grades;
	}
	
	public void setGrade(int moduleIndex, int grade) {
		gradebook[moduleIndex] = grade;
	}
	
	public double avgGrade() {
		int total = 0;
		for(int i = 0; i < gradebook.length; i++) {
			total += gradebook[i];
		}
		return total/numModules;
	}
	
	//for live purposes
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
