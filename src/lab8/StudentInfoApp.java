package lab8;

import java.util.Scanner;

public class StudentInfoApp {

	public static void main(String[] args) {
		int userNumber;
		String userInfo;
		String moreInfo;
		int loopCheck = 1;
		String nextStudent = "y";
		Scanner scnr = new Scanner(System.in);
		String[] names = { "Jeff", "Mickey", "Kyle", "Jake", "Alex", "Ryan", "Spencer", "Drake", "Charlie", "Luke"};
		String[] homeTown = {"Lansing", "Howell", "Adrian", "Hartland", "Detoit", "Pinckney", "Fenton", "Chelsea", "Highland", "Brighton"};
		String[] favFood = {"Meat Loaf", "Cheese Burgers", "Ramen", "Tacos", "Steak", "Pizza", "Onions", "Meatballs", "Korean BBQ", "Powdered Doughnuts"};
		
		System.out.println("Welcome to our class!");
		
		while(nextStudent.equals("y")){
			loopCheck = 1;
			moreInfo = "q";
			System.out.println("Please enter a number 1-10 for that students information.");
			userNumber = scnr.nextInt();
			while ((userNumber > 10) || (userNumber < 1)){
				System.out.println("The number you entered was not in the given range. Please enter a number 1-10.");
				userNumber = scnr.nextInt();
			}
			scnr.nextLine();
			System.out.println("Student number " + userNumber + " is " + names[userNumber-1] + "! What would you like to know about them?(Home Town or Favorite Food)");
			userInfo = scnr.nextLine();
			while (loopCheck == 1) {
				if (userInfo.matches("[Hh][o][m][e] [Tt][o][w][n]")){
					loopCheck = 0;
					System.out.println(names[userNumber -1] + "\'s home town is " + homeTown[userNumber - 1] + "!");
					System.out.println("Would you like to know more about them?");
					moreInfo = scnr.next();
					if (moreInfo.equals("y")) {
						System.out.println(names[userNumber - 1] + "\'s favorite food is " + favFood[userNumber - 1] + "!");
						System.out.println("Would you like to learn about another student?");
						nextStudent = scnr.next();
					}
					else{
						System.out.println("Would you like to learn about another student?");
						nextStudent = scnr.next();
					}
					
				}
				else if (userInfo.matches("[Ff][a][v][o][r][i][t][e] [Ff][o]{2}[d]")){
					loopCheck = 0;
					System.out.println(names[userNumber - 1] + "\'s favorite food is " + favFood[userNumber - 1] + "!");
					System.out.println("Would you like to know more about them?");
					moreInfo = scnr.next();
					if (moreInfo.equals("y")) {
						System.out.println(names[userNumber -1] + "\'s home town is " + homeTown[userNumber - 1] + "!");
						System.out.println("Would you like to learn about another student?");
						nextStudent = scnr.next();
					}
					else{
						System.out.println("Would you like to learn about another student?");
						nextStudent = scnr.next();
					}
					
				}
				else {
					System.out.println("The information you asked for was not in out data base. Please enter favorite food or home town.");
					userInfo = scnr.nextLine();
				}
			}
		}
		System.out.println("Goodbye.");
	}
}
