package school.management.system;

import java.util.List;

public class School {

	/**
	 * Many teachers, Many Students.
	 * 
	 */

	private List<Teacher> teachers;
	private List<Student> students;
	private double totalMoneyEarned;
	private double totalMoneySpent;

	public School(List<Teacher> teacher, List<Student> student) {

		this.teachers = teacher;
		this.students = student;
		totalMoneySpent = 0;
		totalMoneyEarned = 0;
	}

	/**
	 * 
	 * @return The list of teachers in the school
	 */
	public List<Teacher> getTeacher() {
		return teachers;
	}

	/**
	 * Adds a teacher to the school
	 * 
	 * @param teacher teacher the teacher to be added
	 */
	public void addTeacher(Teacher teacher) {

		teachers.add(teacher);
	}
	
	/**
	 * 
	 * @return The list of students in the school.
	 */

	public List<Student> getStudent() {
		return students;
	}

	/**
	 * Adds a student to the school.
	 * @param student
	 */
	public void addStudent(Student student) {
		students.add(student); 
	}

	/**
	 * the total money earend by the school.
	 * @return
	 */
	public double getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	
	public void udpateTotalMoneyEarned(double MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	public double getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * Update the money that is spent by the school wich
	 * is the salary given to the Teachers.
	 * @param totalMoneySpent The money spent by school.
	 */
	public void updateTotalMoneySpent(double moneySpent) {
		totalMoneySpent -= totalMoneyEarned;
	}

}
