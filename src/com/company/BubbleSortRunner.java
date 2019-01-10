package com.company;

public class BubbleSortRunner {

    public static void main(String[] args) {

        int[] intArr = inPlaceSorts.randIntArr(5);
        double[] doubleArr = inPlaceSorts.randDoubleArr(5);
        String[] stringArr = {"I'm", "a", "java", "student"};

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

        inPlaceSorts.bubbleSort(intArr);
        int[] intArr2 = intArr;

        inPlaceSorts.selectionSort(doubleArr);
        int[] doubleArr2 = doubleArr;
    }
}
        /*int[] testArr = {8, 6, 7, 5, 3, 0, 9, 10, 1, 2, 3}
            System.out.print("Before: ");
            for (int num:testArr)
                System.out.println(num + " ");
            System.out.println();

            BubbleSort.Swap(testArr);

            System.out.print("After: ");
            for (int num:testArr)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}