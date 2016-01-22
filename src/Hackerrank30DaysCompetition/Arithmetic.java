package Hackerrank30DaysCompetition;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	double M = sc.nextDouble(); // original meal price
	int T = sc.nextInt(); // tip percentage
	int X = sc.nextInt(); // tax percentage

	double tip = M * T / 100;
	double tax = X * M / 100;
	double finalPrice = M + tip + tax;
	System.out.println("The final price of the meal is $" + Math.round(finalPrice) + ".");
    }
}