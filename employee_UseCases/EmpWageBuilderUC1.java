//Check Employee is Present or Absent
//Check Employee Presence UC 1

package employee_UseCases;

public class EmpWageBuilderUC1 {
	public static void main(String[] args) {
		// Constants
		int IS_FULL_TIME = 1;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("EMPLOYEE IS PRESENT");
		else
			System.out.println("EMPLOYEE IS ABSENT");

	}

}
