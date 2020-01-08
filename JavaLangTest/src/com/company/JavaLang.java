package com.company;

public class JavaLang {

    public static void main(String[] args) {
        String word = "Hyperion";
        char ch = word.charAt(4);
        int length = word.length();
        System.out.println("Original word: " + word);
        System.out.println("Character at index 4: " + ch); //Prints out "r"
        System.out.println("Length of original word: " + length); //Prints out 8
        System.out.println(word.substring(2,4)); //prints out "pe"
        System.out.println(word.substring(2)); //Prints out "perion"
        System.out.println("Index of 'o': " + word.indexOf('o')); //Prints out index position of letter 'o'.

    }
}
