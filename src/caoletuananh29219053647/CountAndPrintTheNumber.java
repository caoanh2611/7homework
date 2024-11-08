
package caoletuananh29219053647;
import java.util.Scanner;
public class CountAndPrintTheNumber {
    public static void main(String[] args) {
         Scanner  CountAndPrintTheNumber =  new Scanner(System.in);
        System.out.print("Enter the number of arrays: ");//Nhập số lượng của mảng
        int number = CountAndPrintTheNumber.nextInt();
        int[] Count = new int[number];
        for(int i  =  0  ; i <  number ; i++){
           System.out.print("Enter the elements of the array: ");
           Count[i]=CountAndPrintTheNumber.nextInt();
          
    }
    
        int coutn = 0 ;
        System.out.print("Count the Occurrences of an Element in the Array: ");
          int temp  =CountAndPrintTheNumber.nextInt();
            for(int i  =  0  ; i <  number ; i++){
                 if( temp == Count[i]) {
                   coutn++;        
                  }
            }
             System.out.println("the Occurrences of an Element in the Array :"+coutn );
}
}
