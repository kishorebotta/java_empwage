package javapractise;

public class UC4 {
	public static void main(String[] args) {
	int is_full_time=1;
	int is_part_time=2;
	int rate_per_hour=20;
	int empHrs=0;
	int empWage=0;
	double empCheck=Math.floor(Math.random() * 10) % 3;
	if (empCheck==is_full_time)
		empHrs=8;
	else if (empCheck==is_part_time)
		empHrs=4;
	
	else
		empHrs=0;
	empWage=empHrs * rate_per_hour;
	System.out.println("EMP WAGE: " + empWage);
		
	}

}
