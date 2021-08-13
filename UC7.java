package javapractise;

public class UC7 {
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	public static final int rate_per_hour=20;
	public static final int num_of_working_days=28;
	public static final int max_no_of_hours=100;
	
	
	public static void main(String[] args) {
		int empHrs=0;
		int empWage=0, total=0 , worked_hrs=0;
		
		while (worked_hrs <= max_no_of_hours) {
			
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
		    worked_hrs += empHrs;
		}
	    System.out.println("total emp wage: " + total);
	}

}
