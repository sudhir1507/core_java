package javaStrings;

import java.util.Scanner;

public class DuplicateCharactorStringApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        sc.close();
        
        char ch[] = str.toCharArray();
        
        // Sort the array
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    char c = ch[i];
                    ch[i] = ch[j];
                    ch[j] = c;
                }
            }
        }

        // Print sorted characters
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println(); // Print a newline for better formatting

        // Find and print duplicate characters
        int count = 1;
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println("Duplicate character: " + ch[i]);
                }
                count = 1; // Reset count
            }
        }
        // Check the last character
        if (count > 1) {
            System.out.println("Duplicate character: " + ch[ch.length - 1]);
        }
    }
}
