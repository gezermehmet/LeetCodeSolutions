package EasyProblems;

import java.util.Arrays;

public class TwoSum {

    static int[] twoSum() {

        int target = 20;
        int[] nums = {2,7,9,11};

        int [] ast = new int[2];
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ast[0] = nums[i];
                    ast[1] = nums[j];
                }
            }
        }
        return ast;
    }

     static void main(String[] args) {

        int[] sonuc = twoSum();
        System.out.println("Sonuç: " + Arrays.toString(sonuc));
    }
}
