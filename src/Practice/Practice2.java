package Practice;

public class Practice2 {

	public static void main(String[] args) {
		
		int[] numbers= {200, -20, 13, 499, 65000};
		int largest = numbers[0];
		
		for(int i =0; i<numbers.length; i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
		}
		System.out.println("The largest number is "+largest);

	}

}
