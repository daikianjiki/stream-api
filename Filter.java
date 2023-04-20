import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    
    public static void main(String[] args) {
     
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(50);
        list.add(1);
        list.add(56);
        list.add(50);

        System.out.println("This is a list of random integers: " +list);
        //output This is a list of random integers: [5, 4, 50, 1, 56, 50]

        //using streams, .filter() can filter out objects in the list.
        //lambda expression is used to filter out odd numbers. 
        List<Integer> filteredList = list.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

        System.out.println("This is a filteres list of integers: " +filteredList);
        //output This is a filteres list of integers: [4, 50, 56, 50]
    }
}
