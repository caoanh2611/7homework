
package caoletuananh_29219053647;

import java.util.ArrayList;
import java.util.Arrays;
public class UpdateAnElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Frist list: " + number);
        number.set(3, 100);
        System.out.println("Updated list: " + number);
    }
 


    
}
