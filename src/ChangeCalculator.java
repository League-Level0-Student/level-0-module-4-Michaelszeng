//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("How many nickel you have");
		// Convert their answer to an int using Integer.parseInt()
int nickelss = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes you have");
		// Ask the user how many quarters they have, and convert their answer
int dimess = Integer.parseInt(dimes);
String quarters = JOptionPane.showInputDialog("How many quarters you have");
int quarterss = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
double maney = nickelss*0.05+dimess*0.1+quarterss*0.25;
		// Tell the user how much money they have
System.out.println("You has $" +maney);

	}
}

