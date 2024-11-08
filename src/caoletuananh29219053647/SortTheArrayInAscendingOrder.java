
package caoletuananh29219053647;
import java.util.Scanner;
import  java.util.Arrays;
public class SortTheArrayInAscendingOrder {
   public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  public static void main(String[] args){
        Scanner SortTheArrayInAscendingOrder=  new Scanner(System.in);
        System.out.print("Enter the number of arrays: ");//Nhập số lượng của mảng
        int number = SortTheArrayInAscendingOrder.nextInt();
        int[] Sort  = new int[number];
        for(int i  =  0  ; i <  number ; i++){
            System.out.print("Enter the elements of the array: ");
            Sort[i]=SortTheArrayInAscendingOrder.nextInt();
        
    }
      for (int i = 0; i < Sort.length - 1; i++) {
            for (int j = 0; j < Sort.length - 1 - i; j++) {
                if (Sort[j] > Sort[j + 1]) {
                    swap(Sort, j, j + 1);
                }
            }
        }

        System.out.println("Array sorted in ascending order: " + Arrays.toString(Sort));
    }
}

