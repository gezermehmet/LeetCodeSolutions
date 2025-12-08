package EasyProblems;

public class ValidPalindrome {

    static void main() {

        String s = "A man, a plan, a canal: Panama";
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                stringBuilder.append(Character.toLowerCase(c));
            }
        }

        String normal = stringBuilder.toString();
        String reverse = stringBuilder.reverse().toString();

        System.out.println(normal.equals(reverse));
      /*   ---------- SOLUTION 1 ----------------------
        String s = "A man, a plan, a canal: Panama";

        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println(cleanS.length());

        int first = 0;
        int last =cleanS.length()-1;

        while(first < last){

            if(cleanS.charAt(first) != cleanS.charAt(last)){
                System.out.println("False");
            }

            first++;
            last--;
            System.out.println("True");
        }*/

    }
}