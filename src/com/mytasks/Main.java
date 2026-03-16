/**
 *  Task: Given two arrays pages and words of size n. The array of pages contains the page numbers and array of words
 *  contains n words. You have to map each word corresponding to its page number and you need to find the word that is
 *  mapped to page number x. If there is no word on x, print null.
 */

package com.mytasks;

/**
 *  Main class.
 */
public class Main {

    // Entry point for JVM.
    public static void main(String[] args) {

        // Calling method dictionary().
        dictionary();

    }

    public static void dictionary(int pages[], String words[], int pg) {

        // Creating an empty string.
        String str = null;

        // Iterating through the pages array.
        for (int i = 0; i < pages.length; i++) {

            // Checking if in array is a page pg.
            if (pages[i] == pg) {

                // Initializing string with a word from words array according to a page number.
                str = words[i];

            }
        }

        // Printing value of the world.
        System.out.println(str);

    }
}