package taskOne;

import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int rowCount = getRandomValue();
        int colCount = getRandomValue();
        int[][] array = new int[rowCount][colCount];

        fillArrayWithRandomValues(array, rowCount, colCount);

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        int sumValue = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (array[i][j] < minValue) {
                    minValue = array[i][j];
                }
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
                sumValue += array[i][j];
            }
        }

        int avgValue = sumValue / (rowCount * colCount);

        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(avgValue);
    }
    private static void fillArrayWithRandomValues(int[][] array, int rowCount, int colCount) {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                array[i][j] = getRandomValue();
            }
        }
    }
    private static int getRandomValue() {
        return RANDOM.nextInt(1, 1000);
    }
}

