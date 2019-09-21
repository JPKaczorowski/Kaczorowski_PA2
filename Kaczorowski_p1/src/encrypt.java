import java.util.Scanner;

/**
 * @author james
 *
 */
public class encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int code;
		
		int dig1;
		int dig2;
		int dig3;
		int dig4;
		
		System.out.print("Enter the integer: ");
		code = scnr.nextInt();
		
		dig1 = code / 1000;
		dig2 = (code %1000) / 100;
		dig3 = (code % 100) / 10;
		dig4 = code % 10;
		
		System.out.print("The encryped integer is: ");
		System.out.println(((dig3 + 7) % 10) + "" + ((dig4 + 7) % 10) + "" + ((dig1 + 7) % 10) + "" + ((dig2 + 7) % 10));
		
	}

}
