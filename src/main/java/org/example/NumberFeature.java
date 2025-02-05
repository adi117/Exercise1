package org.example;

import org.w3c.dom.Text;

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

    public static boolean isPrimeNumber(int number){

        if (number < 2){
            throw new ArithmeticException("Please input number larger than 1!");
        }

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }

        return  true;
    }

    public static int[] sortingSmalltoLarge(int[] list){

        if (list.length < 1){
            throw new IllegalArgumentException("Input cannot be blank!");
        }

        int temp = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 1; j < list.length; j++){
                if (list[j-1] > list[j]){
                    temp = list[j-1];
                   list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }

        return list;
    }

    public static int[] sortingLargetoSmall(int[] list){

        if (list.length < 1){
            throw new IllegalArgumentException("Input cannot be blank!");
        }

        int temp = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 1; j < list.length; j++){
                if (list[j-1] < list[j]){
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }

        return list;
    }

    public static int findLargestNumber(int[] list){
        return sortingLargetoSmall(list)[0];
    }

    public static int findSecondSmallesstNumber(int[] list){
        return sortingSmalltoLarge(list)[1];
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

    public static int calculate(String text){

        String[] number = text.split(" \\" + TextFeature.findSign(text) +  " ");

        int result = 0;

        switch (TextFeature.findSign(text)){
            case "/":
                result = Integer.parseInt(number[0]) / Integer.parseInt(number[1]);
                break;
            case "*":
                result = Integer.parseInt(number[0]) * Integer.parseInt(number[1]);
                break;
            case "-":
                result = Integer.parseInt(number[0]) - Integer.parseInt(number[1]);
                break;
            case "+":
                result = Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
                break;
            default:
                result = 0;
                break;
        }

        return result;

    }

}
