package Hackerrank30DaysCompetition;

import java.util.Scanner;

public class Day4_Person {

    int age;

    public Day4_Person(int initial_Age) {
	if (initial_Age < 0) {
	    System.out.println("This person is not valid, setting age to 0.");
	    age = 0;
	} else {
	    age = initial_Age;
	}
    }

    public void amIOld() {
	if (age < 13) {
	    System.out.println("You are young.");
	} else if (age >= 13 && age < 18) {
	    System.out.println("You are a teenager.");
	} else {
	    System.out.println("You are old.");
	}
    }

    public void yearPasses() {
	age++;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for (int i = 0; i < T; i++) {
	    int age = sc.nextInt();
	    Day4_Person p = new Day4_Person(age);
	    p.amIOld();
	    for (int j = 0; j < 3; j++) {
		p.yearPasses();
	    }
	    p.amIOld();
	    System.out.println();
	}
    }
}
