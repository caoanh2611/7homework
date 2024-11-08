package caoletuananh29219053647;
 import java.util.Scanner;
public class SumAndAverageOfArrayElements {
    public static void main(String[] args) {
        Scanner  ArrayElements =  new Scanner(System.in);
        System.out.print("Enter the number of arrays: ");//Nhập số lượng của mảng
        int number = ArrayElements.nextInt();
        int[] SAnumber = new int[number];
        int sum = 0 ;
        double Average  = 0;
        for(int i  =  0  ; i <  number ; i++){
            System.out.print("Enter the elements of the array: ");
           SAnumber[i]=ArrayElements.nextInt();
          sum +=SAnumber[i];
    }
          Average= sum / number ; 
          System.out.println("\nSum of the elements in the array: "+ sum);
          System.out.println("Average of the elements in the array"+ Average);
}
}
