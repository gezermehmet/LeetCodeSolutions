package EasyProblems;

import java.util.Arrays;

public class MoveZeroes {


    static void main() {
        int[] nums = {0, 1, 2, 0, 0, 0, 3, 9, 12};

        int zero = 0;
        int i = 0;

        for (; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
                zero++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
