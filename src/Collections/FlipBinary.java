package Collections;

import java.util.Scanner;

public class FlipBinary {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	double[] input = new double[a];
	for (int i = 0; i < a; i++) {
	    input[i] = in.nextInt();
	}
	for (double i : input) {
	    int[] binary = new int[32];
	    binary = convertToBinary(i);
	    binary = invertBinary(binary);
	    System.out.printf("%.0f\n", convertToDecimal(binary));
	}
    }

    private static double convertToDecimal(int[] binary) {
	double answer = 0;
	for (int i = 0; i < binary.length; i++) {
	    answer += binary[i] * Math.pow(2, i);
	}
	return answer;
    }

    private static int[] invertBinary(int[] binary) {
	for (int i = 0; i < binary.length; i++) {
	    binary[i] = (binary[i] + 1) % 2;
	}
	return binary;
    }

    private static int[] convertToBinary(double i) {
	int count = 0;
	int[] binary = new int[32];
	while (i > 0) {
	    binary[count++] = (int) (i % 2);
	    i = Math.floor(i / 2);
	}
	for (int j = count; j < 32; j++) {
	    binary[j] = 0;
	}
	return binary;
    }

}