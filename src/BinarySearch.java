public class BinarySearch {
    public int search(int k) {
        int mid = 0;
        int low = 0;
        int high = pool.length - 1;

        while (high >= low) {
            mid = (high + low) / 2;
            if (pool[mid] < k)
                low = mid + 1;
            else if (pool[mid] > k)
                high = mid - 1;
            else
                return mid;
        }
        return NOT_FOUND;
    }
}
