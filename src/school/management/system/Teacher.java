package school.management.system;

public class Teacher {

	/**
	 * This Class is resposible for keeping the track of teacher's name, id, salary.
	 */

	private int id;
	private String name;
	private double salary;

	/**
	 * Create an Teacher object.
	 * 
	 * @param id     id for the teacher.
	 * @param name   name of the teacher.
	 * @param salary salary of the teacher.
	 */

	public Teacher(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}
	
	/**
	 * Set " Update " the Salary.
	 * @param salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
