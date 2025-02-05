package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Sum of number list
        System.out.println(NumberFeature.sumOfNumberList(2352657));

//        Check prime number
        System.out.println(NumberFeature.isPrimeNumber(703));

//        Find the largest number
        System.out.println(NumberFeature.sortingLargetoSmall("0")[0]);

//        Reverse text
        System.out.println(TextFeature.reverseText("halo semuanya"));

//        Fibonacci sequence
        System.out.println(Arrays.toString(NumberFeature.fibonacciSequence(2)));

//        Find vowels in text
        System.out.println(TextFeature.countVowels("muhammad adi wicaksono"));

//        Sort number
        System.out.println(Arrays.toString(NumberFeature.sortingSmalltoLarge("00567125069566")));

//        Anagram text
        System.out.println(TextFeature.isAnagram("adi", "dio"));

//        Find the second-smallest number
        System.out.println(NumberFeature.sortingSmalltoLarge("674650266")[1]);
    }
}