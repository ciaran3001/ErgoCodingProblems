package solutionProblems;

public class Question1reversePrintout {
	
	public static void myFuntion() {
		String input = "'B','A','C','K','W','A','R','D','S'";
		 
        // getBytes() method to convert string
        // into bytes[].
        byte[] reversearray = input.getBytes();
 
        byte[] result = new byte[reversearray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < reversearray.length; i++)
            result[i] = reversearray[reversearray.length - i - 1];
 
        System.out.println(new String(result));
	}
	
	public static void main(String[] args) {
		//calls the Function method for the printout
		myFuntion();
	}

}

