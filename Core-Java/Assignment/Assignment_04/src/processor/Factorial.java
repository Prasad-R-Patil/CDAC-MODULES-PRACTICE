package processor;

public class Factorial extends Processor {

    public Factorial(int data) {
        super(data);
    }

    @Override
    public void process() {
        int result = 1;
        for (int i = 1; i <= data; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + data + " is: " + result);
    }
}
