package com.company;
import java.lang.*;
import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] list, int first, int last)
    {
        if (last > first)
        {
            int pivotindex = partition(list, first, last);
            quickSort(list, first, pivotindex - 1);
            quickSort(list, pivotindex + 1, last);
        }
    }

    static int median(int[] values) {
        // sort array
        Arrays.sort(values);
        double d;
        // get count of scores
        int totalElements = values.length;
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = values[totalElements / 2] + values[totalElements / 2 - 1];
            // calculate average of middle elements
            d = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            d = (double) values[values.length / 2];
        }
        int median = (int)d;
        return median;
    }

    public static int partition(int[] list, int first, int last) {
        int pivot = list[median(list)]; // Choose the median element as the pivot int
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search
        while (high > low) {
// Search forward from left
            while (low <= high && list[low] <= pivot)
                low++;
// Search backward from right
            while (low <= high && list[high] > pivot)
                high--;
// Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > first && list[high] >= pivot)
            high--;
// Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
}
