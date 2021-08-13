package javapractise;

public class UC3 {
	public static void main(String[] args) {
		
	int is_full_time=1;
	int rate_per_hour=20;
	int empHrs=0;
	int empWage=0;
	double empCheck=Math.floor(Math.random() * 10) % 2;
	if (empCheck==is_full_time)
		empHrs=8;
	else
		empHrs=0;
	empWage=empHrs * rate_per_hour;
	System.out.println("EMP WAGE: " + empWage);
		
    }
}
