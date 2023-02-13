import counter.Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setValue(5);

        System.out.println("Counter initial value: " + counter.getValue());

        counter.decrementTill(3);

        System.out.println("Counter decremented value: " + counter.getValue());
    }
}