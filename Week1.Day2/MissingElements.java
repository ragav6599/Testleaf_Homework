package week1.day2;
import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		int[] input = {1,2,3,4,7,6,8};
		
		Arrays.sort(input);
		
		for (int i = 1; i < input.length; i++) {
			if (i != input[i-1]) {
				
				System.out.println(i);
				break;
				
			}
			
		}
	}

}
