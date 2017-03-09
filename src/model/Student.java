package model;

/**
 * A simple class that represents a student at a university.
 * 
 * @author Jorge Vergara
 *    
 */
public class Student {

	// Instance variables
	private double gpa;
	private String name, major;
	private int age;

	/**
	 * Constructor for student. Initializes instance variables
	 * 
	 * @param name
	 *            The name of the student
	 * @param major
	 *            The student's major
	 * @param gpa
	 *            The student's GPA
	 * @param age
	 *            The age of the student, in years
	 */
	public Student(String name, String major, double gpa, int age) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
		this.age = age;
	}

	/**
	 * Returns the GPA of the student
	 * 
	 * @return the GPA of the student
	 */
	public double getGPA() {
		return gpa;
	}

	public void setGPA(double g) {
		this.gpa = g;
	}

	/**
	 * Returns the name of the student
	 * 
	 * @return the name of the student
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the major of the student
	 * 
	 * @return the major of the student
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * Returns the age of the student, in years
	 * 
	 * @return the age of the student, in years
	 */
	public int getAge() {
		return age;
	}

}
