import java.util.Scanner;

public class polling_program {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String topics[] = {"Olympic Sports", "Government Spending", "The color yellow", "Space colonization", "Insects"};
		int[][] responses ={
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		}; 										// number of a particular rating for a particular issue
		
		int rating;								// users rating for a particular issue
		int numResponses = 0;					// number of responses to survey (used to calc avgRating) 
		double avgRating;							// average rating of an issue
		String done = "yes";							// answer to do you want to rate again
		int i = 0;
		int j = 0;
		double tempTotal = 0.0;
		double[] total = new double[5];
		
		
		while (done.equals("yes")) {
			
			System.out.println("Please rate the importance of the following topics on a scale of 1-10.");
			System.out.println("");
			
			for( i=0; i<5; i++) {
				System.out.print(topics[i] + ": ");
				rating = scnr.nextInt();
				responses[i][rating-1]++;
			}
				
				
			numResponses++;
			System.out.println("");
			System.out.print("Would someone else like to answer to survey (yes/no)? ");
			done = scnr.next();
			System.out.println("");
		}
		
		System.out.println("Thank you for your responses!");
		System.out.println("");
		
		System.out.println("                     1  2  3  4  5  6  7  8  9  10");
		for (i=0; i<5; i++) {
			System.out.println(topics[i]);
			System.out.print("                   ");
			for (j=0; j<10; j++) {
				System.out.print("  " + responses[i][j]);
				tempTotal += (responses[i][j] * (j + 1));
			}
			total[i] = tempTotal;
			//System.out.print("    tot: " + total);
			avgRating = (tempTotal / (double)numResponses);
			System.out.print("    avg: " + avgRating);
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			tempTotal = 0;
		}
		
		
			
			
			
			
	}
		
		
		
		
}


