import java.util.Arrays;

public class ChoiceSorting {
    private static void choiceSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minNumber = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[minNumber] > array[j]) {
                    minNumber = j;
                }
            }

            int temp = array[minNumber];
            array[minNumber] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 16, 5, 14, 13, 12, 11, 15, 4, 3};
        // int[] array = {9, 16, 3, 5, 14, 13, 12, 11, 15, 4, 7};

        choiceSorting(array);
        System.out.println(Arrays.toString(array));
    }
}
