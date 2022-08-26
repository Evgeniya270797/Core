package taskTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        sortMethod(num);
        System.out.println(Arrays.toString(num));
    }

    private static void sortMethod(int[] num) {
        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
