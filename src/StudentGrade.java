/**
 * StudentGrade class
 * Contains the definition for a class to hold a student name
 * and multiple grades.  The class provides methods for toString,
 * equals, and get/set for the attributes.  
 * @author Scylla
 */

public class StudentGrade {

	private String name;
	private double quiz1;
	//TODO: declare remaining attributes

	private double quiz2;
	private double quiz3;
	private double midterm;
	private double finalExam;
	
	private double computeAverage()
	{
		//TODO: complete. Remove stub code.

		double quizT = quiz1 + quiz2 + quiz3;

		double qTemp = (215 * .25) / 15 * quizT;
		double mTemp = (215 * .35) / 100 * midterm;
		double fTemp = (215 * .40) / 100 * finalExam;

		return ((qTemp + mTemp + fTemp) / 215) * 100;
	}
	
	//TODO: no-argument constructor
	public StudentGrade()
	{
		quiz1 = 0.0;
		quiz2 = 0.0;
		quiz3 = 0.0;
		midterm = 0.0;
		finalExam = 0.0;
	}
	
	//TODO: constructor with a parameter for the name

	public StudentGrade(String name1)
	{
		name = name1;
		quiz1 = 0.0;
		quiz2 = 0.0;
		quiz3 = 0.0;
		midterm = 0.0;
		finalExam = 0.0;
	}
	
	/** 
	 * toString
	 * This method overrides the Object class' toString method
	 * @return the student information as a string.  All attributes are
	 * included, plus a call to the computeAverage() method for determining
	 * class average.
	 */
	
	public String toString()
	{
		//TODO: complete. Remove stub code.
		String str = "Name : " + getName() + 
					 "\nQuiz 1: " + getQuiz1() + " Quiz 2: " + getQuiz2() + " Quiz 3: " + getQuiz3() +
					 "\nMidterm: " + getMidterm() +
					 "\nFinal Exam: " + getFinal() +
					 "\nClass Average: " + String.format("%3.1f",computeAverage());

		return str;
	}
	
	/** 
	 * equals
	 * This method overrides the Object class' equals method
	 * @param 	student2	the student to which to compare this one
	 * @return 	true if student name is the same between this student
	 * 			and the passed in student.  false otherwise.
	 */
	
	public boolean equals(StudentGrade student2)
	{
		return this.getName().equals(student2.getName());
	}

	/**
	 * getName
	 * @return	name	the student's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName
	 * @param	n	the value to set our student name
	 */
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * getQuiz1
	 * @return	quiz1	the first quiz score
	 */
	public double getQuiz1() {
		return quiz1;
	}

		/**
	 * getQuiz2
	 * @return	quiz2	the first quiz score
	 */
	public double getQuiz2() {
		return quiz2;
	}

		/**
	 * getQuiz3
	 * @return	quiz3	the first quiz score
	 */
	public double getQuiz3() {
		return quiz3;
	}

		/**
	 * getMidterm
	 * @return	midterm	the first quiz score
	 */
	public double getMidterm() {
		return midterm;
	}

		/**
	 * getFinal
	 * @return	finalExam	the first quiz score
	 */
	public double getFinal() {
		return finalExam;
	}

	/**
	 * setQuiz1
	 * @param	q1	the value to set our first quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz1(double q1) {
		boolean retVal = false;
		if (q1 >=0 && q1 <=5)
		{
			quiz1 = q1;
			retVal = true;
		}
		else
		{
			System.out.println("Valid quiz scores are 0-5.");
			System.out.print("Quiz 1: ");
		}
		return retVal;
	}

		/**
	 * setQuiz2
	 * @param	q2	the value to set our second quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz2(double q2) {
		boolean retVal = false;
		if (q2 >=0 && q2 <=5)
		{
			quiz2 = q2;
			retVal = true;
		}
		else
		{
			System.out.println("Valid quiz scores are 0-5.");
			System.out.print("Quiz 2: ");
		}
		return retVal;
	}

		/**
	 * setQuiz3
	 * @param	q3	the value to set our third quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz3(double q3) {
		boolean retVal = false;
		if (q3 >=0 && q3 <=5)
		{
			quiz3 = q3;
			retVal = true;
		}
		else
		{
			System.out.println("Valid quiz scores are 0-5.");
			System.out.print("Quiz 3: ");
		}
		return retVal;
	}

		/**
	 * setMidterm
	 * @param	mid	the value to set our midterm
	 * @return  true if midterm value is in the range 0-100.
	 * false if it is out of range
	 */
	public boolean setMidterm(double mid) {
		boolean retVal = false;
		if (mid >=0 && mid <=100)
		{
			midterm = mid;
			retVal = true;
		}
		else
		{
			System.out.println("Valid exam scores are 0-100.");
			System.out.print("Midterm Exam: ");
		}
		return retVal;
	}

		/**
	 * setFinal
	 * @param	finalE	the value to set our first quiz
	 * @return  true if finalE value is in the range 0-100.
	 * false if it is out of range
	 */
	public boolean setFinal(double finalE) {
		boolean retVal = false;
		if (finalE >=0 && finalE <=100)
		{
			finalExam = finalE;
			retVal = true;
		}
		else
		{
			System.out.println("Valid exam scores are 0-100.");
			System.out.print("Final Exam: ");
		}
		return retVal;
	}
	
	
	
}
