package school.management.system;

/**
 * 
 * @author Rayan
 * 
 *         This Class is responsible for keeping the track of student fees,
 *         name, grade
 *
 */
public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	/**
	 * To create a new student by initiaizing. Fees for every student is $30,000.
	 * Fees paid initially is 0.
	 * 
	 * @param id    id for a new student; unique.
	 * @param name  name of the student.
	 * @param grade grade of the student.
	 */

	public Student(int id, String name, int grade) {
		feesPaid = 0;
		feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;

	}

	// Not going to alter student's name, Student's id.

	/**
	 * Used to update the student's grade.
	 * 
	 * @param grade new grade of the student.
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}

	public int getGrade() {
		return grade;
	}

	/**
	 * Keep adding the fees to feespaid field. Add the fees to the fees paid. The
	 * school is going to receive the funds.
	 * 
	 * @param fees the fees that student pays.
	 */
	public void updateFeesPaid(int fees) {
		this.feesPaid += fees;

	}

}
