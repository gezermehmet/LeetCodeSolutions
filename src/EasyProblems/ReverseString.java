package EasyProblems;

import java.util.*;

public class ReverseString {

    static void main() {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        int first = 0;
        int last = s.length - 1;

        while(last > first){

            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;

            first++;
            last--;
        }

        System.out.println(s);
    }
}
