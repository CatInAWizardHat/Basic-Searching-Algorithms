package Searcher;

public class BetterSearch extends Searcher {

   public BetterSearch(int[] data) {
      super(data);
   }

   @Override
   public int search(int k) {
      int midLow, midHigh = 0;
      int low = 0;
      int high = pool.length - 1;
      if (k >= pool[low] && k <= pool[high]) {
         while (high >= low) {
            midLow = ((high + low) / 3);
            midHigh = (midLow != low) ? (midLow * 2) - 1 : 1;
            if (k == pool[low]) {
               return low;
            } else if (k == pool[midLow]) {
               return midLow;
            } else if (k == pool[midHigh]) {
               return midHigh;
            } else if (k == pool[high]) {
               return high;
            }

            if (k > pool[midLow] && k < pool[midHigh]) {
               low = midLow + 1;
               high = midHigh - 1;
            } else if (k < pool[midLow]) {
               high = midLow - 1;
            } else if (k > pool[midHigh]) {
               low = midHigh + 1;
            }
         }
      }
      return NOT_FOUND;
   }
}
