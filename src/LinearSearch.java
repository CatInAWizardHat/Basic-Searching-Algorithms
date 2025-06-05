public class LinearSearch {
	public int search(int k) {
		for (int i = 0; i < pool.length; i++)
			if (pool[i] == k)
				return i;

		return NOT_FOUND;
	}

}
