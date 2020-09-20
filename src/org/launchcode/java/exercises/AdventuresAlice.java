package org.launchcode.java.exercises;


import java.util.Scanner;

public class AdventuresAlice {

    public static void main(String[] args) {
       String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
       Scanner in = new Scanner(System.in);
       System.out.println("Type in a word to search for: ");
       String searchTerm = in.nextLine();
       String lowerSentence = sentence.toLowerCase();
       String lowerSearchTerm = searchTerm.toLowerCase();
       System.out.println(lowerSentence.contains(lowerSearchTerm));
       int index = lowerSentence.indexOf(lowerSearchTerm);
       System.out.println(index);
       System.out.println(lowerSentence.replace(searchTerm, "")); //works, but loses capitalization

        //get everything from beginning to index
        String firstPart = sentence.substring(0, index);

        //get everything from after the word to the end
        String secondPart = sentence.substring(index + searchTerm.length());

        System.out.println(firstPart + secondPart);
       in.close();

    }
}
