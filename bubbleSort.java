/*
Max Pursche
Bubble Sort
*/
import java.util.*;
public class bubbleSort {
   public static void main(String[] args) {
      int[] sample = new int[]{8,9,5,4,6,3,2,2,7,8}; //sample array of ints
      bubbleSort(sample); //method function
   }
   
   /**
      bubble sorts the given array and prints the array
      @param array of integers
   */
   public static void bubbleSort(int[] a) {
      boolean sorted = false;
      while (!sorted) { 
         sorted = true;
         for(int i = 0; i < a.length-1; i++) { //sorting through an array
            if (a[i] > a[i+1]) { //comparing size
               int temp = a[i]; //swapping spots
               a[i] = a[i+1];
               a[i+1] = temp;
               sorted = false; //checks to see if swapped
            }
         }      
      }
      System.out.println(Arrays.toString(a));//in order to print the array
   }
}