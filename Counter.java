package OOP;

public class Counter {

    public static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void finalize() {
        count --;
    }

};


