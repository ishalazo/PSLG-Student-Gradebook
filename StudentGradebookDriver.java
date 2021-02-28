import java.util.*;
public class StudentGradebookDriver {
	public static void main(String[] args) {
		Student s1 = new Student("AL1111", "LM121", 5);
		Student s2 = new Student("LL1234", "LM121", 5);
		Student s3 = new Student("CW1212", "MA415", 5);
		
		s1.setRandomGrades();
		s2.setRandomGrades();
		s3.setRandomGrades();
		
		Sem2Results exResults = new Sem2Results();
		exResults.addStudent(s1);
		exResults.addStudent(s2);
		exResults.addStudent(s3);
		
		exResults.displayAll();
		
		System.out.println("LM121 Course Average: " + exResults.courseAvg("LM121") + "\n");
		
		exResults.removeStudent(s1);
		
		exResults.displayAll();
		
		//Example 2
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student s4 = new Student("QW1231", "CS456", 5);
		Student s5 = new Student("ER4567", "CS456", 5);
		Student s6 = new Student("TY7890", "CS456", 5);
		
		s4.setRandomGrades();
		s5.setRandomGrades();
		s6.setRandomGrades();
		
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		
		Sem2Results ex2Results = new Sem2Results(studentList);
		ex2Results.displayAll();
	}

}
