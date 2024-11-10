
package caoletuananh_29219053647;
import java.util.ArrayList;
import java.util.Arrays;
public class TraverseTheArrayList {
    public static void main(String[] args) {
    ArrayList<String> cittes =  new ArrayList<>(Arrays.asList("Ha Noi","Thai Nguyen ","Da Nang " ,"Hue" , "Sai Gon"));
        System.out.println("City Name : ");
        for(String city : cittes){// String city(đại hiện cho cac phan tu cua cittes gắn biên vao city)  : cittes = for(int i  = 1 ;  i <=cittes.size() ; i ++) 
            System.out.println(city);
        }
}
}