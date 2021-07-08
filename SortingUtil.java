public class SortingUtil {

    public static void insertionSort(int[] arr) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in unsorted array by one iteration
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            // Swap found minimum element with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
//*************************************quickSort method******************************************************
    public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // move left element to the right until its smaller from pivot
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            // move the right marker until the element is more than the pivot
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            // check that there is no need to swap the elements that the markers point to
            if (leftMarker <= rightMarker) {
                // The left marker will be smaller than the right marker only if we execute swap
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // move markers to get new borders
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // call recursive method for parts
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}