package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Sum of number list
        System.out.println(NumberFeature.sumOfNumberList(2352657));

//        Find the largest number
        System.out.println(NumberFeature.sortingLargetoSmall("15782324257946652478")[0]);

//        Sort number
        System.out.println(Arrays.toString(NumberFeature.sortingSmalltoLarge("567125069566")));

//        Find the second-smallest number
        System.out.println(NumberFeature.sortingSmalltoLarge("674650266")[1]);
    }
}