import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int code;
		
		int dig1;
		int dig2;
		int dig3;
		int dig4;
		
		System.out.print("Enter the  encrypted integer: ");
		code = scnr.nextInt();
		
		dig3 = code / 1000;
		dig4 = (code %1000) / 100;
		dig1 = (code % 100) / 10;
		dig2 = code % 10;
		
		
		dig3 = ((dig3 + 10) - 7) % 10;
		dig4 = ((dig4 + 10) - 7) % 10;
		dig1 = ((dig1 + 10) - 7) % 10;
		dig2 = ((dig2 + 10) - 7) % 10;
		
		System.out.print("The original integer is: ");
		System.out.print(dig1 + "" + dig2 + "" + dig3 + "" + dig4);
		
	}

}
