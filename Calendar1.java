/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year < 2000){
	 		month = 1;
	 		while(month<=12){
	 			dayOfMonth = 1;
	 			while(dayOfMonth <= nDaysInMonth(month,year)){
	 				System.out.println(dayOfMonth + "/" + month + "/" + year);
	 				dayOfMonth++;
	 			}
	 		month++;
	 		}
	 	year++;
	 		//// Write the body of the while 		
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (false) { 
	 			break;
	 		}
        }
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance(int advanceDayMonthYear) {
		advanceDayMonthYear++;
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
	    if(((year % 400) == 0) || ((year % 4) == 0 ) && ((year % 100)!= 0))  {
	    	isLeapYear = true;
	    }
		return isLeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		int dayOfMonth = 0;
		if(month == 2) {
			if(isLeapYear(year)){
				dayOfMonth = 29;
			}else{
				dayOfMonth = 28;
			}
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			dayOfMonth = 30;
		}else{
			dayOfMonth = 31;
		}
		return dayOfMonth;
	}
}