import java.util.ArrayList;
import java.util.Scanner;


public class arrayTest {

	public static void main(String[] args) {
		ArrayList<Integer> cus = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter CU for a class: ");
		while (input.hasNextInt()){
			
			int value = input.nextInt();
			
			if (value < 0){
				System.out.println("Error: must no negative numbers: ");
				break;
			}
			cus.add(value);
			System.out.println(cus);
			System.out.println("Enter CU for another CU for a class (or enter exit): ");
			
		}
}
}
