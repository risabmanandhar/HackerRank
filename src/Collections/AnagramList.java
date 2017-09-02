package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AnagramList {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	scan.nextLine();
	String array[] = new String[n];
	for (int i = 0; i < n; i++) {
	    array[i] = scan.nextLine();
	}
	scan.close();
	List<List<String>> result = new ArrayList<>();
	result = getListOfAnagrams(array, n);
	for (List<String> list : result) {
	    for (String str : list) {
		System.out.print(str + " ");
	    }
	    System.out.println();
	}
    }

    private static List<List<String>> getListOfAnagrams(String[] array, int n) {
	Map<String, List<String>> map = new HashMap<>();
	for (String str : array) {
	    String key = getKey(str);
	    List<String> tempList = new ArrayList<>();
	    if (map.containsKey(key)) {
		tempList = map.get(key);
	    }
	    tempList.add(str);
	    map.put(key, tempList);
	}

	List<List<String>> result = new ArrayList<>();
	for (String str : map.keySet()) {
	    result.add(map.get(str));
	}
	return result;
    }

    private static String getKey(String str) {
	char[] arr = str.toCharArray();
	Arrays.sort(arr);
	return String.valueOf(arr);
    }
}