
package caoletuananh_29219053647;
import java.util.ArrayList;
import java.util.Arrays;
public class SortArrayList{
    public static void swap(Integer[] a ,int i ,  int j ) {
        int temp = a[i];
        a[i] = a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        ArrayList<Integer> Sort  = new ArrayList<>(Arrays.asList(5,3,8,2,4));
        Integer[] SortArray =Sort.toArray(new Integer[0]);
        for(int i = 0 ; i <SortArray.length - 1 ; i++ ){
             for(int j = 0  ; j <SortArray.length - 1 - i  ; j++ ){
                 if(SortArray[j] > SortArray[j + 1]){
                     swap(SortArray , j , j +1  );
                } 
             }
        }
         System.out.println("Array sorted in ascending order: " + Arrays.toString(SortArray));
    }
}
/*
 ngoai ra co the su dung import java.util.Collections; 
Collections.sort(number);
   System.out.println("Sorted list: " +number);
*/
 


    
