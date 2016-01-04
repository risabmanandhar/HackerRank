package Collections;
import java.util.Scanner;

public class GnomeSort {

    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] ar = new int[n];
	for (int j = 0; j < n; j++) {
	    ar[j] = in.nextInt();
	}
	ar = gnomeSort(ar);
    }

    public static int[] gnomeSort(int[] ar) {
	for (int i = 0; i < ar.length - 1; i++) {
	    if (ar[i] > ar[i + 1]) {
		int tempIndex = i;
		while (tempIndex >= 0) {
		    if (ar[tempIndex] > ar[tempIndex + 1]) {
			int temp = ar[tempIndex + 1];
			ar[tempIndex + 1] = ar[tempIndex];
			ar[tempIndex] = temp;
			tempIndex--;
		    } else {
			tempIndex = -1;
		    }
		}
	    }
	}
	return ar;
    }

}