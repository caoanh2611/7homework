
package caoletuananh_29219053647;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class ConvertArrayListToArray {
    public static void main(String[] args) {
        Random rand = new Random(); 
       ArrayList<Integer> number = new ArrayList<>();
       for (int i = 0; i < 5; i++) {
          number.add(rand.nextInt(100));
        }
        Integer[] numbers = number.toArray(new Integer[0]);// dong day arraylist va 1 array
        System.out.println("Array elements:");
        for (Integer num : number) {
            System.out.println(num);
        }
    }

    
}
