/*
 * the code is valid for only if array is sorted in ascending order
 * and to apply code u must know wheather arry is sorted in ascending order or descending order
 * in that case we use Order-Agnostic binary search
 */


/**
 * BinarySearch
 * Time Complexity Best Case:- O(1)
 * Time Complexity Worst Case:- O(log N)
 * 
 */
public class BinarySearch {
   public static void main(String[] args) {
      int []arr={2,4,7,9,12,34,80,92,99};
      int target=89;
      System.out.println(binarysearch(arr, target));
   }

   /*
    * return index
    * if index not found return -1
    */

   static int binarysearch(int[] arr, int target) {
      int start = 0;
      int end = arr.length - 1;

      while (start <= end) {
         // find middle element
         // int mid =(start+end)/2; //might be possible that start + end may go out of
         // int range for very large value

         int mid = start + ((end - start) / 2);
         if (target > arr[mid]) {
            start = mid + 1;
         } else if (target < arr[mid]) {
            end = mid - 1;
         } else 
         // ans found
            return mid;
      }

      return -1;
   }
}
