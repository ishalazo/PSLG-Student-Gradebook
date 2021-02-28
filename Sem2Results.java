import java.util.*;

public class Sem2Results {
	ArrayList<Student> ulStudents;
	
	public Sem2Results() {
		ulStudents  = new ArrayList<Student>();
	}
	
	public Sem2Results(ArrayList<Student> studentList) {
		ulStudents = studentList;
	}
	
	public void addStudent(Student s) {
		ulStudents.add(s);
	}
	
	public void removeStudent(Student s) {
		ulStudents.remove(s);
	}
	
	public int courseSize(String course) {
		int total = 0;
		for(Student s : ulStudents) {
			if(s.getCourse().equals(course)) {
				total++;
			}
		}
		return total;
	}
	
	public double courseAvg(String course) {
		int total = 0;
		for(Student s : ulStudents) {
			if(s.getCourse().equals(course)) {
				total += s.avgGrade();
			}
		}
		return total/courseSize(course);
	}
	
	public void displayAll() {
		for(Student s : ulStudents) {
			System.out.println(s.toString());
		}
	}
	
}
