package MediumProblems;

import java.util.Arrays;

public class ThreeSumClosest {
    static void main() {

        int[] nums = {-1,2,1,-4};
        int target = 1;

        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length-2; i++){
            int left = i + 1;
            int right = nums.length-1;


            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(currentSum == closestSum){
                    System.out.println(currentSum);
                }

                if(Math.abs(target - currentSum) < Math.abs(target-closestSum)){
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++; // Toplam az geldi, büyüt
                } else {
                    right--; // Toplam çok geldi, küçült
                }
            }
        }
        System.out.println(closestSum);
    }
}
