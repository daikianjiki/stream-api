import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    
    public static void main(String[] args) {
        
        //this arraylist will store a random integer
        List<Integer> list = new ArrayList<Integer>();

        list.add(100);
        list.add(90);
        list.add(500);
        list.add(150);
        list.add(350);
        list.add(900);

        System.out.println("List of integers from list: " +list);
        //List of integers from list: [100, 90, 500, 150, 350, 900]

        //using stream, .map() will map out all the objects inside the list.
        //also, by using the lambda expression, it can add 300 to every object that is mapped out.
        List<Integer> updatedList = list.stream()
        .map(n -> n + 300)
        .collect(Collectors.toList());

        System.out.println("List of integers from updatedList: " +updatedList);
        //List of integers from updatedList: [400, 390, 800, 450, 650, 1200]
    }


}
