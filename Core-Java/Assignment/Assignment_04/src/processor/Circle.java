package processor;

public class Circle extends Processor {

    public Circle(int radius) {
        super(radius);
    }

    @Override
    public void process() {
        float area = 3.14f * data * data;
        System.out.println("Area of Circle with radius " + data + " is: " + area);
    }
}
