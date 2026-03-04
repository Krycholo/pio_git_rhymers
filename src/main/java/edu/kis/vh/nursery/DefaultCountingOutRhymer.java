package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int T = -1;

    private int[] numbers = new int[12];

    public int total = T;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == T;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekabo() {
        if (callCheck())
            return T;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return T;
        return numbers[total--];
    }

}
