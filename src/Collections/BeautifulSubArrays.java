package HackerRank;

public class BeautifulSubArrays {
    public static void main(String[] args) {
	int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int m = 3;
	System.out.println(beautifulSubarrays(array, m));
    }

    static long beautifulSubarrays(int[] a, int m) {
	int totalCount = 0;
	for (int i = 0; i < a.length; i++) {
	    boolean exceed = false;
	    int count = 0;
	    for (int j = a.length - 1; j >= i; j--) {
		if (a[j] % 2 == 1) {
		    count++;
		}
		if (count > m) {
		    exceed = true;
		    break;
		}
	    }
	    if (count == m) {
		totalCount++;
	    }
	    for (int j = a.length - 1; j >= i; j--) {
		if (a[j] % 2 == 1) {
		    count--;
		}
		if (count < m) {
		    break;
		}
		if (count == m) {
		    totalCount++;
		}
	    }
	    if (!exceed) {
		break;
	    }
	}
	if ((a.length - 1) % 2 == 0 && m == 1) {
	    totalCount++;
	}
	return totalCount;
    }

}
