package com.company.dataStructure.정렬;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            this.swap(arr, min, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public void swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class test{
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] arr = new int[]{69, 10, 30, 2, 16, 8, 31, 22};
        sort.selectionSort(arr);
    }
}
