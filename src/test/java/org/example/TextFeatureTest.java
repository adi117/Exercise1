package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextFeatureTest {

    @Test
    @DisplayName("Reverse Text")
    void testReverseText(){
        assertEquals("olleh", TextFeature.reverseText("hello"));
    }

    @Test
    @DisplayName("Count Vowels")
    void testCountVowels(){
        assertEquals(3, TextFeature.countVowels("programming"));
        assertEquals(3, TextFeature.countVowels("coffee"));
    }

    @Test
    @DisplayName("Check Anagram")
    void testCheckAnagram(){
        assertTrue(TextFeature.isAnagram("listen", "silent"));
        assertFalse(TextFeature.isAnagram("hello", "world"));
    }
}