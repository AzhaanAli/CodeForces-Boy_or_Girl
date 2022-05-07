import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** DIRECTIONS:
         * Find the amount of distinct characters in a string.
         * Let distinct characters be denoted by x.
         * If x is even, print "CHAT WITH HER!"
         * If x is odd, print "IGNORE HIM!"
         */

        // We can store all characters of the string in a hashset.
        // This is useful, as hashsets do not store copies, and thus by nature can only hold unique characters.
        Scanner s = new Scanner(System.in);

        HashSet<Character> unique = new HashSet<>();
        for(char c : s.nextLine().toCharArray())
            unique.add(c);
        System.out.println((unique.size() & 1) == 0? "CHAT WITH HER!" : "IGNORE HIM!");


    }
}