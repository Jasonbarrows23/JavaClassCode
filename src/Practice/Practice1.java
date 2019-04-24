package Practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		//sum number in Array
		
		int[] numbers= {12,4,5,2,6,9,0};
		int sum=0;
		
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		System.out.println(sum);
	}

}
