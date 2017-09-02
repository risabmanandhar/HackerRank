package HackerRank;

import java.util.Scanner;

public class GenerateBrackets {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	scan.close();
	char[] str = new char[n * 2];
	printParenthesis(str, 0, 0, 0, n);
    }

    private static void printParenthesis(char[] str, int index, int open, int close, int n) {
	if (close == n) {
	    for (int i = 0; i < n * 2; i++) {
		System.out.print(str[i]);
	    }
	    System.out.println();
	    return;
	}
	if (open > close) {
	    str[index] = '}';
	    printParenthesis(str, index + 1, open, close + 1, n);
	}

	if (open < n) {
	    str[index] = '{';
	    printParenthesis(str, index + 1, open + 1, close, n);
	}
    }

}
