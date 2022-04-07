package util;

public class Sort {
    private void merge(int array[], int left, int middle, int right) {
        int low = middle - left + 1; // size of the left subarray
        int high = right - middle; // size of the right subarray

        int L[] = new int[low]; // create the left and right subarray
        int R[] = new int[high];

        int i = 0, j = 0;

        for (i = 0; i < low; i++) // copy elements into left subarray
        {
            L[i] = array[left + i];
        }
        for (j = 0; j < high; j++) // copy elements into right subarray
        {
            R[j] = array[middle + 1 + j];
        }

        int k = left; // get starting index for sort
        i = 0; // reset loop variables before performing merge
        j = 0;

        while (i < low && j < high) // merge the left and right subarrays
        {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < low) // merge the remaining elements from the left subarray
        {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < high) // merge the remaining elements from right subarray
        {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int array[], int left, int right) // helper function that creates the sub cases for sorting
    {
        int middle;
        if (left < right) { // sort only if the left index is lesser than the right index (meaning that
                            // sorting is done)
            middle = (left + right) / 2;

            mergeSort(array, left, middle); // left subarray
            mergeSort(array, middle + 1, right); // right subarray

            merge(array, left, middle, right); // merge the two subarrays
        }
    }
}
