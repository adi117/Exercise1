package org.example;

import java.util.Arrays;

public class NumberFeature {

    public static int sumOfNumberList(int number){

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


}
