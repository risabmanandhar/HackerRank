package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FolderDirectory {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String input = "dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
	String[] inputArray = input.split("\n");
	Stack<String> stack = new Stack<String>();
	List<String> paths = new LinkedList<String>();
	int newElementLevel = 0;
	int currentStackLevel = 0;
	for (String string : inputArray) {
	    newElementLevel = string.length() - string.trim().length();
	    if (string.contains(".")) {
		for (int i = 0; i <= currentStackLevel - newElementLevel; i++) {
		    stack.pop();
		}
		paths.add(getStackContent(stack) + string.trim());
	    } else {
		if (newElementLevel == 0) {
		    stack.clear();
		    stack.push(string.trim());
		} else {
		    if (newElementLevel > currentStackLevel) {
			stack.push(string.trim());
		    } else {
			for (int i = 0; i <= currentStackLevel - newElementLevel; i++) {
			    stack.pop();
			}
			stack.push(string.trim());
		    }
		}
	    }
	    currentStackLevel = stack.size() - 1;
	}
	for (String string : paths) {
	    System.out.println(string);
	}
    }

    private static String getStackContent(Stack<String> stack) {
	String result = "";
	for (String string : stack) {
	    result += string + "\\";
	}
	return result;
    }
}