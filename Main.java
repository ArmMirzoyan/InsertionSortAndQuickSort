import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x1 = { 11, 22, 52, 17, 123, 1, 7, 110, 132, -234 };
        System.out.println("before Quick sorting");
        System.out.println(Arrays.toString(x1));

        int low = 0;
        int high = x1.length - 1;

        SortingUtil.quickSort(x1, low, high);
        System.out.println("after Quick sorting");
        System.out.println(Arrays.toString(x1));

        int[] x2 = { 11, 22, 52, 17, 123, 1, 7, 110, 132, -234 };
        System.out.println("before Insertion sorting");
        System.out.println(Arrays.toString(x2));

        SortingUtil.insertionSort(x2);
        System.out.println("after Insertion sorting");
        System.out.println(Arrays.toString(x2));
    }
}
