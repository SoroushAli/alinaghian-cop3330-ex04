/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package base;

import java.util.Scanner;

/*
Example Output

Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints

Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

Challenges

Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String noun = getNoun();
        String verb = getVerb();
        String adj = getAdjective();
        String adverb = getAdverb();
        printOutput(noun, verb, adj, adverb);
    }

    private static void printOutput(String noun, String verb, String adj, String adverb) {
        System.out.println(String.format("Enter a noun: %s\nEnter a verb: %s\nEnter an adjective: %s\nEnter an adverb: %s\nDo you %s your %s %s %s? That's hilarious!", noun, verb, adj, adverb, verb, adj, noun, adverb));
    }

    private static String getAdverb() {
        return in.nextLine();
    }

    private static String getAdjective() {
        return in.nextLine();
    }

    private static String getVerb() {
        return in.nextLine();
    }

    private static String getNoun() {
        return in.nextLine();
    }
}
