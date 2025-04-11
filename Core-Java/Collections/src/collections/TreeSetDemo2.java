package collections;

import java.util.*;

public class TreeSetDemo2{
	
    public static void main(String[] args) {
       
        TreeSet<StringBuilder> t = new TreeSet<>(Comparator.comparing(StringBuilder::toString));


        t.add(new StringBuilder("A"));      
        t.add(new StringBuilder("Hello")); 
        t.add(new StringBuilder("Java"));   
        t.add(new StringBuilder("A"));       


        for (StringBuilder sb : t) {
            System.out.println(sb);
        }
    }
}
