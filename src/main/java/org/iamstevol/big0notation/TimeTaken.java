package org.iamstevol.big0notation;

public class TimeTaken {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeTaken sample = new TimeTaken();
        System.out.println(sample.findSum2(5320));

        System.out.println(System.currentTimeMillis() - now);
    }

    public int findSum(int n) {
        return n * (n+1)/2;
    }

    public int findSum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}
