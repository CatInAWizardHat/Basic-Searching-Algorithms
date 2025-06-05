package Searcher;

public class LinearSearch extends Searcher {

	public LinearSearch(int[] data) {
		super(data);
	}

	@Override
	public int search(int k) {
		for (int i = 0; i < pool.length; i++)
			if (pool[i] == k)
				return i;

		return NOT_FOUND;
	}

}
