package EasyProblems;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    static void main() {

        int n = 100;
        List ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ans.add(
                    i % 15 == 0 ? "FizzBuzz" :
                    i % 5 == 0 ? "Buzz" :
                    i % 3 == 0 ? "Fizz" :
                    String.valueOf(i)
            );
        }

        System.out.println(ans);

    }

}
