package MainPackage;
import java.util.Scanner;

public class rater {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Prompt user to input number of touchdowns
		System.out.println("Enter number of touchdowns: ");
		double TD = input.nextDouble();
		
		//Prompt user to input number of passing yards
		System.out.println("Enter number of passing yards: ");
		double Yards = input.nextDouble();
		
		//Prompt user to input number of interceptions
		System.out.println("Enter number of interceptions: ");
		double INT = input.nextDouble();
		
		//Prompt user to input number of completions
		System.out.println("Enter number of completions: ");
		double Comp = input.nextDouble();
		
		//Prompt user to input number of passes attempted
		System.out.println("Enter number of passes attempted: ");
		double ATT = input.nextDouble();
		
		//Calculates passing rating
		double a = ((Comp/ATT - .3)*5);
		double b = ((Yards/ATT - 3)*.25);
		double c = ((TD/ATT)*20);
		double d = 2.375-((INT/ATT)*25);
		
		double PasserRating = ((a+b+c+d)/6)*100;
		System.out.print("Passer Rating is: ");
		System.out.printf("%.2f", PasserRating);
		
		input.close();		

	}

}
