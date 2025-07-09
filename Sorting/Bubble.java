import java.util.Arrays;

public class Bubble {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {75, 56, 89, 90, 45, 67};
        System.out.println("Before sorting: " + Arrays.toString(studentMarks));
        bubbleSort(studentMarks);
        System.out.println("After sorting: " + Arrays.toString(studentMarks));
    }
}
