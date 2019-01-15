package com.company;

public class BubbleSortRunner {

    public static void main(String[] args) {

        int[] intArr = Sorter.randInt(5);
        double[] doubleArr = Sorter.randDouble(5);
        String[] stringArr = Sorter.randString(5, 5);

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

        //sorter with times
        long selectionStart = 0;
        long selectionStop = 0;
        long insertionStart = 0;
        long insertionStop = 0;
        long bubbleStart = 0;
        long bubbleStop = 0;

        insertionStart = System.nanoTime();
        Sorter.insertionSort(intArr);
        insertionStop = System.nanoTime() - insertionStart;
        int[] intArr2 = intArr;

        selectionStart = System.nanoTime();
        Sorter.selectionSort(doubleArr);
        selectionStop = System.nanoTime() - selectionStart;
        double[] doubleArr2 = doubleArr;

        bubbleStart = System.nanoTime();
        Sorter.bubbleSort(stringArr);
        bubbleStop = System.nanoTime() - bubbleStart;
        String[] stringArr2 = stringArr;

        System.out.print("Int Array After: ");
        for (int num:intArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Took " + insertionStop);

        System.out.print("Double Array After: ");
        for (double num:doubleArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Took " + selectionStop);

        System.out.print("String Array After: ");
        for (String num:stringArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Took " + bubbleStop);

        System.out.println("sorter race");

        intArr = Sorter.randInt(5);
        copyInt = Sorter.copyInt(intArr);

        System.out.print("Int Array: ");
        for (int num : intArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionStart = System.nanoTime();
        Sorter.insertionSortRace(intArr);
        insertionStop = System.nanoTime() - insertionStart;
        int[] intArr3 = intArr;

        selectionStart = System.nanoTime();
        Sorter.selectionSortRace(intArr);
        selectionStop = System.nanoTime() - selectionStart;
        int[] intArr4 = intArr;

        bubbleStart = System.nanoTime();
        Sorter.bubbleSortRace(intArr);
        bubbleStop = System.nanoTime() - bubbleStart;
        int[] intArr5 = intArr;

        System.out.print("Insertion Sort Race: ");
        for (int num:intArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(insertionStop + " nanoseconds");

        System.out.print("Selection Sort Race: ");
        for (int num:intArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(selectionStop + " nanoseconds");

        System.out.print("Bubble Sort Race: ");
        for (int num:intArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(bubbleStop + " nanoseconds");
    }
}
