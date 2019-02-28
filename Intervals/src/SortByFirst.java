package Question2;

import java.util.Comparator;
import java.util.List;

public class SortByFirst implements Comparator <List<Integer>>{
	public int compare(List<Integer> a, List<Integer> b) {
		return a.get(0) - b.get(0);
	}
}
