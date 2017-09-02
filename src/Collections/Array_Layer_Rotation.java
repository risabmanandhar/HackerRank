package HackerRank;
import java.util.LinkedList;
import java.util.Scanner;

public class Array_Layer_Rotation {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int row = scan.nextInt();
	int col = scan.nextInt();
	int rot = scan.nextInt();
	int array[][] = new int[row][col];
	for (int i = 0; i < row; i++) {
	    for (int j = 0; j < col; j++) {
		array[i][j] = scan.nextInt();
	    }
	}
	rotate(array, rot);
	for (int i = 0; i < row; i++) {
	    for (int j = 0; j < col; j++) {
		System.out.print(array[i][j] + " ");
	    }
	    System.out.println();
	}
	scan.close();
    }

    private static void rotate(int[][] array, int rot) {
	int row = array.length;
	int col = array[0].length;
	for (int layer = 0; layer < (row > col ? col : row) / 2; layer++) {
	    LinkedList<Integer> list = new LinkedList<>();
	    list = layerToList(array, layer);
	    rotate(list, rot % list.size());
	    listToLayer(array, layer, list);
	}
    }

    private static void listToLayer(int[][] array, int layer, LinkedList<Integer> list) {
	for (int i = layer; i < array[0].length - layer; i++) {
	    array[layer][i] = list.removeFirst();
	}
	for (int i = layer + 1; i < array.length - layer; i++) {
	    array[i][array[0].length - layer - 1] = list.removeFirst();
	}
	for (int i = array[0].length - layer - 2; i >= layer; i--) {
	    array[array.length - layer - 1][i] = list.removeFirst();
	}
	for (int i = array.length - layer - 2; i >= layer + 1; i--) {
	    array[i][layer] = list.removeFirst();
	}
    }

    private static void rotate(LinkedList<Integer> list, int rot) {
	for (int i = 0; i < rot; i++) {
	    list.add(list.removeFirst());
	}
    }

    private static LinkedList<Integer> layerToList(int[][] array, int layer) {
	LinkedList<Integer> list = new LinkedList<>();
	for (int i = layer; i < array[0].length - layer; i++) {
	    list.add(array[layer][i]);
	}
	for (int i = layer + 1; i < array.length - layer; i++) {
	    list.add(array[i][array[0].length - layer - 1]);
	}
	for (int i = array[0].length - layer - 2; i >= layer; i--) {
	    list.add(array[array.length - layer - 1][i]);
	}
	for (int i = array.length - layer - 2; i >= layer + 1; i--) {
	    list.add(array[i][layer]);
	}
	return list;
    }
}