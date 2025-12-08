package EasyProblems;

import java.util.Arrays;

public class RemoveDuplicate {

    static void main() {

        int[] nums = {3, 4, 6, 7, 7, 7, 1, 2, 3};


        //Arrays.sort(nums);
       // System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                if (nums[i] == nums[j]) {
                    nums[i] = Integer.MAX_VALUE;
                }
            }
        }

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
        }

        System.out.println(count + ", nums = " + Arrays.toString(nums));
    }
}
