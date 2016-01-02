package Collections;
import java.util.Scanner;

public class InsertionSort {

    public static void insertionSortPart2(int[] ar) {
	for (int i = 1; i < ar.length; i++) {
	    for (int j = 0; j < i; j++) {
		if (ar[i] < ar[j]) {
		    int temp = ar[i];
		    ar[i] = ar[j];
		    ar[j] = temp;
		}
	    }
	    printArray(ar);
	}
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int s = in.nextInt();
	int[] ar = new int[s];
	for (int i = 0; i < s; i++) {
	    ar[i] = in.nextInt();
	}
	insertionSortPart2(ar);

    }

    private static void printArray(int[] ar) {
	for (int n : ar) {
	    System.out.print(n + " ");
	}
	System.out.println("");
    }
}
