package com.company;

public class BubbleSort {

    public static void Swap(int[] testArr, int i, int j) {
        int constantPos = 0;
        int changingPos = 1;
        int temp;

        for (temp, changingPos <= testArr.length, changingPos++) {
            if (constantPos > changingPos) {
                temp = changingPos;
                changingPos = constantPos;
                constantPos = temp;
            }
        }
    }



}
