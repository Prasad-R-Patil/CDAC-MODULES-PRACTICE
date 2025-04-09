package wrapperClass;

public class WrapperDemo {

    public static void main(String[] args) {
        int no = 100;

        Integer i = new Integer(no);  // Boxing (before Java 9, now deprecated)
        int b = i.intValue();         // Unboxing
        
        String str = "20";
        
        int a = Integer.parseInt(str);
        
        Integer c = Integer.valueOf(str);

        System.out.println("Primitive int: " + b);
        System.out.println("Primitive int: " + c);
    }
}
