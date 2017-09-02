package HackerRank;

import java.util.HashSet;
import java.util.Set;

public class ZombieCluster {

    public static void main(String[] args) {
	String[] array = { "1100", "1110", "0110", "0001" };
	System.out.println(zombieCluster(array));
    }

    static int zombieCluster(String[] zombies) {
	Set<Set<Integer>> setOfSet = new HashSet<>();
	for (int i = 0; i < zombies.length; i++) {
	    for (int j = i; j < zombies.length; j++) {
		if (zombies[i].charAt(i) == zombies[i].charAt(j)) {
		    addToSetOfSet(setOfSet, i, j);
		}
	    }
	}
	return setOfSet.size();
    }

    private static void addToSetOfSet(Set<Set<Integer>> setOfSet, int i, int j) {
	boolean setI = false;
	boolean setJ = false;
	for (Set<Integer> set : setOfSet) {
	    if (set.contains(i)) {
		setI = true;
		set.add(j);
		break;
	    }
	    if (set.contains(j)) {
		setJ = true;
		set.add(i);
		break;
	    }
	}
	if (!setI && !setJ) {
	    Set<Integer> newSet = new HashSet<>();
	    if (!setI) {
		newSet.add(i);
	    }
	    if (!setJ) {
		newSet.add(j);
	    }
	    setOfSet.add(newSet);
	}
    }
}
