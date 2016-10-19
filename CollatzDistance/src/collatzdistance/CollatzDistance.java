
package collatzdistance;

import java.util.Scanner;
public class CollatzDistance {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int input;
		System.out.println("Input an integer: ");
		input = keyboard.nextInt();
		
		if (input <= 0){
			System.exit(0);
		}
		while (input >= 1){
			if (input % 2 == 0){
				input = input/2;
				System.out.print(input+",");

			}
			if (input % 2 != 0 && input > 1) {
				input = input * 3 + 1;
				System.out.print(input+",");

			}
			
		}

	}

}

