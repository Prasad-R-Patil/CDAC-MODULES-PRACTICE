package collections;
import java.util.*;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            int k = i + i + 2;
            l.add(k);
        }

        System.out.println("Original List: " + l);

        ListIterator<Integer> itr = l.listIterator();

       
        while (itr.hasNext()) {
            itr.next();
        }


        while (itr.hasPrevious()) 
        {
        	
            int i = itr.previous();
            if (i == 10) {
                //itr.set(55);  
                //itr.remove();  
                itr.add(13); 
                System.out.println("Modified List: " + l);
            }
        }
    }
}
