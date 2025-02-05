package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberFeature {

    public static int sumOfNumberList(int number){

        if (number < 1){
            throw new ArithmeticException("Please input number larger than 0!");
        }

        int sum = 0;

        while(number > 0){
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static boolean isPrimeNumber(){
        return  true;
    }

    public static int[] sortingSmalltoLarge(String list){

        if (list.length() < 1){
            throw new IllegalArgumentException("Input cannot be blank!");
        }

        String[] sortedNumber = list.split("");

        int[] arrayInteger = Arrays.stream(sortedNumber).mapToInt(Integer::parseInt).toArray();

        int temp = 0;

        for (int i = 0; i < arrayInteger.length; i++){
            for (int j = 1; j < arrayInteger.length; j++){
                if (arrayInteger[j-1] > arrayInteger[j]){
                    temp = arrayInteger[j-1];
                    arrayInteger[j-1] = arrayInteger[j];
                    arrayInteger[j] = temp;
                }
            }
        }

        return arrayInteger;
    }

    public static int[] sortingLargetoSmall(String list){

        if (list.length() < 1){
            throw new IllegalArgumentException("Input cannot be blank!");
        }

        String[] sortedNumber = list.split("");

        int[] arrayInteger = Arrays.stream(sortedNumber).mapToInt(Integer::parseInt).toArray();

        int temp = 0;

        for (int i = 0; i < arrayInteger.length; i++){
            for (int j = 1; j < arrayInteger.length; j++){
                if (arrayInteger[j-1] < arrayInteger[j]){
                    temp = arrayInteger[j-1];
                    arrayInteger[j-1] = arrayInteger[j];
                    arrayInteger[j] = temp;
                }
            }
        }

        return arrayInteger;
    }

    public static int[] fibonacciSequence(int number){

        if (number < 0){
            throw new ArithmeticException("The number must be larger than 0!");
        }

        int[] fibonacciNumber = new int[number];
        fibonacciNumber[0] = 0;
        fibonacciNumber[1] = 1;

        for (int i = 2; i < number; i++){
            fibonacciNumber[i] = fibonacciNumber[i - 1] + fibonacciNumber[i - 2];
        }

        return fibonacciNumber;

    }

}
