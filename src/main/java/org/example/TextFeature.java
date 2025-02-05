package org.example;

import java.util.Arrays;

public class TextFeature {
    public static String reverseText(String text){

        if (text.length() < 1){
            throw new IllegalArgumentException("Input cannot be blank!");
        }

        String[] charText = text.split("");
        String[] reversedText = new String[charText.length];

        for(int i = 0; i < charText.length; i++){
            reversedText[i] = charText[charText.length - 1 - i];
        }

        return String.join("", reversedText);

    }

    public static boolean isAnagram(String text1, String text2){

        if (text1.isBlank() || text2.isBlank()){
            throw new IllegalArgumentException("Input cannot be blank!");
        }

        String[] arrayText1 = text1.split("");
        String[] arrayText2 = text2.split("");

        int count = 0;

        for (int i = 0; i < arrayText1.length; i++){
            for (int j = 0; j < arrayText2.length; j++){
                if (arrayText2[j].equals(arrayText1[i])){
                    count++;
                }
            }
        }

        if (count == arrayText1.length){
            return true;
        }

        return false;
    }

    public static int countVowels(String text){

        if (text.length() < 1){
            throw new IllegalArgumentException("Input cannot be blank!");
        }

        String[] charText = text.toUpperCase().split("");
        String[] vowels = {"A", "I", "U", "E", "O"};

        int count = 0;

        for (int i = 0; i < charText.length; i++){
            for (int j = 0; j < vowels.length; j++){
                if (vowels[j].equals(charText[i])){
                    count++;
                }
            }
        }

        return count;

    }
}
