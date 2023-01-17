package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		// Teachers
		Teacher Aljohara = new Teacher(1, "Aljohara", 50000);
		Teacher Rayan = new Teacher(2, "Rayan", 70000);
		Teacher Deem = new Teacher(3, "Deem", 40000);
		
		List<Teacher> teacList = new ArrayList<>();
		teacList.add(Aljohara);
		teacList.add(Rayan);
		teacList.add(Deem);
		
		// Students
		
		Student Abdullah = new Student(1, "Abduallah", 4);
		Student Rakan = new Student(2, "Rakan", 2);
		Student Fahad = new Student(3, "Fahad", 5);
		
		List<Student> stuList = new ArrayList<>();
		
		stuList.add(Abdullah);
		stuList.add(Rakan);
		stuList.add(Fahad);
		
		
		School mod = new School(teacList,stuList);
		
		System.out.println("MOD has Earend: $"+mod.getTotalMoneyEarned());
		

	}

}
