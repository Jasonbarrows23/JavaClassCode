package Practice;

public class StringMethods {

	public static void main(String[] args) {
		
		String Str1 = "This is really not immutable!!";
		String Str2 = Str1;
		String Str3 = "This is really not immutable!!";
		boolean retVal; 
		retVal = Str1.equals( Str2 );
		System.out.println("Value = " + retVal );
		retVal = Str1.equals( Str3 );
		System.out.println("Value = " + retVal );
		} 
	} 
