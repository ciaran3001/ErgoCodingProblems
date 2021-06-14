package solutionProblems;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question2datePrintout {
	
	public static void myFunction(){
		
		//Date format
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		
		//Variables for Dates
		String dateStartStr = "24 11 2020";
		String dateEndStr = "7 0 2021";
		
		
		//try catch method
		try {
			Date dateStart = myFormat.parse(dateStartStr);
		    Date dateEnd = myFormat.parse(dateEndStr);
		    
		    //For 64-bit
		    long difference = dateEnd.getTime() - dateStart.getTime();
		    
		    //Fractional numbers
		    float daysBetween = (difference / (1000*60*60*24));
	        
		    System.out.println("Number of Days between two dates: "+daysBetween);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		 }
		
	}
	
	public static void main(String args[]) {
		//calls the Function method for the printout
		myFunction();
	}

}
