package com.company;

public class BubbleSortRunner {

    public static void main(String[] args) {

        int[] intArr = Sorter.randInt(5);
        double[] doubleArr = Sorter.randDouble(5);
        String[] stringArr = {"I'm", "a", "java", "student"};

        int[] copyInt = Sorter.copyInt(intArr);
        double[] copyDouble = Sorter.copyDouble(doubleArr);
        String[] copyString = Sorter.copyString(stringArr);

        System.out.print("Int Array: ");
        for (int num : intArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Double Array: ");
        for (double num : doubleArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("String Array: ");
        for (String num : stringArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        Sorter.insertionSort(intArr);
        int[] intArr2 = intArr;

        Sorter.selectionSort(doubleArr);
        double[] doubleArr2 = doubleArr;

        Sorter.bubbleSort(stringArr);
        String[] stringArrArr2 = stringArr;

        System.out.print("Int Array After: ");
        for (int num:intArr){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("Double Array After: ");
        for (double num:doubleArr){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("String Array After: ");
        for (String num:stringArr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
