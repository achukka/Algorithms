import java.util.ArrayList;

import java.util.List;

public class Subset {
	public static void main(String[] args) {
		int k = Integer.parseInt(args[0]);
		List<String> inputList = new ArrayList<>();
		String val;
		while (StdIn.hasNextChar()) {
			val = StdIn.readString();
			inputList.add(val);
		}
		int N = inputList.size();
		int index;
		for (int i = 0; i < k; i++) {
		
			index = StdRandom.uniform(N);
			val = inputList.get(index);
			StdOut.println(val);
		}
	}
}
