package processor;

public abstract class Processor {

    protected int data;

    public Processor() {}

    public Processor(int data) {
        this.data = data;
    }

    public abstract void process();
}
