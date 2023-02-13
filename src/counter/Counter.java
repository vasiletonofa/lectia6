package counter;

public class Counter {

    public Counter() {
        System.out.println("Counter created");
    }
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value > 0) {
            this.value = value;
        }
    }

    public void increment(int times) {
        if(times > 0) {
            for (int i = 0; i < times; i = i + 1) {value = value + i;}
        }

        if(true) {

        }
    }

    public void incrementFromTo(int from, int times, int valueToAdd) {  // from = 5; times = 3; times+from = 8
        if(times > 0 && from > -1 ) {
            for (int i = from;  times > 0; i = i - 1, times--) { // times = 3; times = 2; times = 1; times = 0;
                value = value + i;
            }
        }
    }

    public void decrementTill(int x) { // 0


    }




}
