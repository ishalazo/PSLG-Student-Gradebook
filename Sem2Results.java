import java.util.*;

public class Sem2Results {
	ArrayList<Student> ulStudents;
	
	//Instantiate ulStudents
	public Sem2Results() {
		ulStudents  = new ArrayList<Student>();
	}

	//Sets ulStudents with given Student ArrayList
	public Sem2Results(ArrayList<Student> studentList) {
		ulStudents = studentList;
	}

	//Add an individual Student
	public void addStudent(Student s) {
		ulStudents.add(s);
	}

	//Remove an individual Student
	public void removeStudent(Student s) {
		ulStudents.remove(s);
	}

	//Find the size of a specified course
	public int courseSize(String course) {
		int total = 0;
		for(Student s : ulStudents) {
			if(s.getCourse().equals(course)) {
				total++;
			}
		}
		return total;
	}

	//Find the average of a specified course
	public double courseAvg(String course) {
		int total = 0;
		for(Student s : ulStudents) {
			if(s.getCourse().equals(course)) {
				total += s.avgGrade();
			}
		}
		return total/courseSize(course);
	}

	//Print all students inside gradebook
	public void displayAll() {
		for(Student s : ulStudents) {
			System.out.println(s.toString());
		}
	}
	
}
