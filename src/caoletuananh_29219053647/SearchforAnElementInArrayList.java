
package caoletuananh_29219053647;
import java.util.*;
public class SearchforAnElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> keywords  = new ArrayList<>(Arrays.asList("Java","Python","C++","JavaScript"));
        boolean found =  false ;
        for(String words : keywords){
            if(words == "Python" ){//co thee thay words == "Python" = word.equals("Python") de dam bao chuoi ;
               found =  true;
                break;
            }
            if(true){
                   System.out.println("Found Python in the list!");      
            }else{
                  System.out.println("Not Found Python in the list!");
                  /*   co the su dung import java.util.Collections;  
                  boolean hasPython = keywords(ArrayList la chứa các chuỗi) contains(là một phương thức củ)("Python"); boolean kieu tra ve  (true of false
                  System.out.println("Contains 'Python': " + hasPython);
                  */
            }
        }
    }
}
