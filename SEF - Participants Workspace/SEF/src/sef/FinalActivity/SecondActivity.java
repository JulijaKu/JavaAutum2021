package sef.FinialActivity;

public class SecondActivity {

    int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }

        return diff;
    }

    public int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;

    }

    public int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;
    }
}
