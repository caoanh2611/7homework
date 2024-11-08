
package caoletuananh29219053647;
 import java.util.Scanner;
public class FindMaxAndMinInArray {
    public static void main(String[] args) {
        Scanner Find=  new Scanner(System.in);
        System.out.print("Enter the number of arrays: ");//Nhập số lượng của mảng
        int number = Find.nextInt();
        int[] FindNumber = new int[number];
        for(int i  =  0  ; i <  number ; i++){
            System.out.print("Enter the elements of the array: ");
            FindNumber[i]=Find.nextInt();
        
    }
        int Maxvl= FindNumber[0];
        int Minvl= FindNumber[0];
        for(int i  = 0 ; i < FindNumber.length ; i++){
            if(Maxvl < FindNumber[i] ) Maxvl=FindNumber[i];
            if(Minvl > FindNumber[i] ) Minvl=FindNumber[i];
        }
        System.out.println("The largest element of the array: " +Maxvl);
          System.out.println("The Smallest element of the array: "+Minvl);
    }
    
}
