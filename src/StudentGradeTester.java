/**
 * StudentGradeTester class
 * Contains the code to test the methods of the StudentGrade class
 * Creates an instance of a StudentGrade, fills it with data, and displays
 * all information to the screen.  
 * @author Scylla
 */

import java.util.Scanner;

public class StudentGradeTester {

	public static void main(String[] args) {
		String name1;
		double holder;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Welcome to the Student Grades Program");
		System.out.print("Enter the name for the student: ");
		name1 = kbd.nextLine();
		
		//create an instance of StudentGrade, passing in the name given above
		StudentGrade s1 = new StudentGrade(name1);
		
		//prints out all current information about the student - their name and default
		//values of 0 for all scores and average
		System.out.println("Here is the current data for this student: ");
		System.out.println(s1);
		
		System.out.println("Please enter the following information for " + s1.getName());
	
		//TODO: complete the code to ask for quiz scores 1-3, the midterm exam, and the final exam
		System.out.print("Quiz 1: ");
		do {
			holder = kbd.nextDouble();
		} while (s1.setQuiz1(holder) == false);			

		System.out.print("Quiz 2: ");
		do {
			holder = kbd.nextDouble();
		} while (s1.setQuiz2(holder) == false);	

		System.out.print("Quiz 3: ");
		do {
			holder = kbd.nextDouble();
		} while (s1.setQuiz3(holder) == false);	

		System.out.print("Midterm Exam: ");
		do {
			holder = kbd.nextDouble();
		} while (s1.setMidterm(holder) == false);	

		System.out.print("Final Exam: ");
		do {
			holder = kbd.nextDouble();
		} while (s1.setFinal(holder) == false);	

	
		//prints out all current information about the student, including average
		System.out.println("Here is the current data for this student: ");
		System.out.println(s1);

		kbd.close();
		
	}

}
