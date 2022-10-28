package assignments;
import java.util.HashMap;

public class EqualSets {

	public static void main(String[] args) {
		EqualSets obj = new EqualSets();
		boolean isEqual = obj.isEqual();
		if(isEqual) System.out.println("Equal");
		else System.out.println("Not Equal");
	}

	public boolean isEqual() {
		int a[] = new int[] { 1, 2, 5, 4, 0 };
		int b[] = new int[] { 2, 4, 5, 0, 1 };
		HashMap<Integer, Integer> count = new HashMap<>();
		if (a.length == b.length) {
			for (int i : a) {
				count.putIfAbsent(i, 0);
				count.put(i, count.get(i) + 1);
			}
			for (int i : b) {
				if (count.containsKey(i)) {
					count.put(i, count.get(i) - 1);
				} else {
					return false;
				}
			}
			for (int i : count.keySet()) {
				if (count.get(i) == 0)
					continue;
				else {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}

	}
}
