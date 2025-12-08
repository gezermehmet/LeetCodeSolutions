package EasyProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String original = String.valueOf(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);

        /*
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        String number = String.valueOf(a);

        char[] list = number.toCharArray();
        List<Character> charList = new ArrayList<>(new String(list).chars().mapToObj(c -> (char) c).toList());


        System.out.println(charList);
        Collections.reverse(charList);
        System.out.println(charList);

        for (char karakter : charList) {
            sb.append(karakter);
        }
        String last = sb.toString();

        int lastNumber = Integer.parseInt(last);

        if (a == lastNumber) {
            System.out.println("Palindrome!!");
        } else System.out.println("Not");

        */
    }
}

