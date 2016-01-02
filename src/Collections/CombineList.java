package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineList {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String first = in.nextLine();
	String second = in.nextLine();
	List<String> firstList = getListOfCharacters(first);
	List<String> secondList = getListOfCharacters(second);
	if (firstList.size() > secondList.size()) {
	    firstList = combineBoth(firstList, secondList);
	    displayList(firstList);
	} else {
	    secondList = combineBoth(secondList, firstList);
	    displayList(secondList);
	}
    }

    private static void displayList(List<String> firstList) {
	for (String string : firstList) {
	    System.out.print(string + "\t");
	}
    }

    private static List<String> combineBoth(List<String> first, List<String> second) {
	for (int i = 0; i < second.size(); i++) {
	    first.add(i * 2 + 1, second.get(i));
	}
	return first;
    }

    private static List<String> getListOfCharacters(String a) {
	List<String> list = new ArrayList<String>();
	for (int i = 0; i < a.length(); i++) {
	    list.add(a.charAt(i) + "");
	}
	return list;
    }
}