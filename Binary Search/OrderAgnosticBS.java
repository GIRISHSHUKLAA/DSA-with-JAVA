/*
 *  this code is valid for all cases even if we do not know wheather
 *  the array is sorted in ascending or descending order
 *
 *  time complexity of order agnostic binary. search is same as simple binary search i.e -->
 *  Time Complexity Best Case:- O(1)
 *  Time Complexity Worst Case:- O(log N)
 */



public class OrderAgnosticBS {
   public static void main(String[] args) {
       int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
       int target = 22;
       int ans = orderAgnosticBS(arr, target);
       System.out.println(ans);
   }

   static int orderAgnosticBS(int[] arr, int target) {
       int start = 0;
       int end = arr.length - 1;

       // find whether the array is sorted in ascending or descending
       boolean isAsc = arr[start] < arr[end];

       while(start <= end) {
           // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
           int mid = start + (end - start) / 2;

           if (arr[mid] == target) {
               return mid;
           }

           if (isAsc) {
               if (target < arr[mid]) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
           } else {
               if (target > arr[mid]) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
           }
       }
       return -1;
   }
}
