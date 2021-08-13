package javapractise;

public class UC6 {
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	public static final int rate_per_hour=20;
	public static final int num_of_working_days=30;
	
	public static void main(String[] args) {
		int empHrs=0;
		int empWage=0, total=0;
		
		for (int day=0 ; day < num_of_working_days ; day++) {
			int empCheck= (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
			case is_part_time:
				empHrs=4;
				break;
				
			case is_full_time:
				empHrs=8;
				break;
		    default:
		    	empHrs=0;
		    	
			}
		    empWage=empHrs * rate_per_hour;
		    total=total + empWage ;
		}
	    System.out.println("total emp wage: " + total);
	}
}
		
		


