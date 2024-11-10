
package caoletuananh_29219053647;
import java.util.ArrayList;
public class RemoveAnElemenFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for(int i  =1 ; i <= 10 ; i++){
            number.add(i);
        }
        number.remove(Integer.valueOf(5));//Integer.valueOf() chuyen int , string thanh 1 doi tuong integer
//         for(Integer i  = 0; i <= 10 ; i++){
//            number.add(i);
//        }
//         number.remove(5);
        System.out.println("ArrayList after removing 5: " + number);
    }
 
}
