
package lesson3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a multi-word sentence: ");
        String sentence= keyboard.nextLine();
        System.out.println(sentence);
        
        System.out.println("Enter a one word string: ");
        String s= keyboard.next();
        System.out.println(s);
    }
}
