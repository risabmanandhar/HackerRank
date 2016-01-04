package Collections;
import java.util.LinkedList;

public class SeparateList {

    public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	LinkedList<LinkedList<Integer>> separatedList = new LinkedList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	list.add(10);
	separatedList = getSeparatedList(list, 2);
	for (LinkedList<Integer> linkedList : separatedList) {
	    System.out.println(linkedList);
	}
    }

    private static LinkedList<LinkedList<Integer>> getSeparatedList(LinkedList<Integer> list, int n) {
	LinkedList<LinkedList<Integer>> separatedList = new LinkedList<>();
	for (int i = 0; i < list.size(); i = i + n) {
	    LinkedList<Integer> temp = new LinkedList<>();
	    for (int k = i; (k < list.size()) && (k < (i + n)); k++) {
		temp.add(list.get(k));
	    }
	    separatedList.add(temp);
	}
	return separatedList;
    }
}