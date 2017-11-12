
package practice;

import java.util.ArrayList;
import java.util.List;

public class practice1 {
    public static void main(String[] args) {
        
        //Capacity defaults to 10
        List<String> groceryList = new ArrayList<>();
        groceryList.add("Amond Milk");
        groceryList.add("Cereal");
        groceryList.add("Fruit");
        groceryList.add("Cereal");
        
        //new style for loop, use if you don't need a counter
        for(String s : groceryList){
            String item = s;
            System.out.println(item);
        }
        
        //example of a method we didn't go over in class
        groceryList.clear();
        System.out.println(groceryList.size());
    }
 
}
