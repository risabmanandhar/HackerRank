package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringContainsAnotherStringPermutation {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	String first = in.nextLine();
	String second = in.nextLine();

	if (first.length() > second.length()) {
	    System.out.println(checkContains(first, second));
	} else {
	    System.out.println(checkContains(second, first));
	}
    }

    private static boolean checkContains(String a, String b) {
	List<String> first = getListOfCharacters(a);
	List<String> second = getListOfCharacters(b);
	boolean found = false;
	for (int i = 0; i < second.size(); i++) {
	    found = false;
	    for (int j = 0; j < first.size(); j++) {
		if (first.get(j).equals(second.get(i))) {
		    first.remove(j);
		    found = true;
		    break;
		}
	    }
	}
	return found;
    }

    private static List<String> getListOfCharacters(String a) {
	List<String> list = new ArrayList<String>();
	for (int i = 0; i < a.length(); i++) {
	    list.add(a.charAt(i) + "");
	}
	return list;
    }

}