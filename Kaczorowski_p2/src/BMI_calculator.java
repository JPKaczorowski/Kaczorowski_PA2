import java.util.Scanner;

public class BMI_calculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String calcMode;
		double weight;
		double height;
		double bmi = 0;
		
		System.out.print("Which calculation mode would you like (lb or kg)? ");
		calcMode = scnr.next();
		
		if (calcMode.equals("lb")){
			System.out.print("What is your weight in pounds? ");
			weight = scnr.nextDouble();
			System.out.print("What is your height in inches? ");
			height = scnr.nextDouble();
			
			bmi = (703.0 * weight) / (Math.pow(height, 2.0));
		}
		else if (calcMode.equals("kg")){
			System.out.print("What is your weight in kilograms? ");
			weight = scnr.nextDouble();
			System.out.print("What is your height in meters? ");
			height = scnr.nextDouble();
			
			bmi = weight / (Math.pow(height, 2.0));
			
		}
		
		System.out.println("");
		System.out.printf("Your BMI is %.2f.\n", bmi);
		
		if (bmi < 18.5) {
			System.out.println("You are underweight.");
		}
		else if ((bmi >= 18.5) && (bmi < 25.0)) {
			System.out.println("You are normal weight.");
		}
		else if ((bmi >= 25.0) && (bmi < 30.0)) {
			System.out.println("You are overweight.");
		}
		else if (bmi >= 30.0) {
			System.out.println("You are obese.");
		}
		System.out.println("");
		System.out.println("ACCORDING TO THE NATIONAL HEART INSTITUTE:");
		System.out.println("Underweight: BMI<18.5");
		System.out.println("Normal weight : BMI 18.5–24.9");
		System.out.println("Overweight: BMI 25–29.9");
		System.out.println("Obesity: BMI of 30 or greater");
		
		

	}

}
