package Collections;

import java.math.BigInteger;
import java.util.Scanner;

public class FiboModified {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String input = in.nextLine();
	int a = Integer.parseInt(input.split(" ")[0]);
	int b = Integer.parseInt(input.split(" ")[1]);
	int c = Integer.parseInt(input.split(" ")[2]);
	System.out.println(fibo(a, b, c - 1));
    }

    private static BigInteger fibo(int a, int b, int c) {
	if (c == 0) {
	    return new BigInteger(a + "");
	} else if (c == 1) {
	    return new BigInteger(b + "");
	} else {
	    return ((fibo(a, b, c - 1).pow(2)).add(fibo(a, b, c - 2)));
	}
    }

}