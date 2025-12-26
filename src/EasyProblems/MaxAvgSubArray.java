package EasyProblems;

public class MaxAvgSubArray {

    static void main() {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int left = 0;
        double sum = 0;
        double maxSum = -100000;

        for (int i = 0; i < k; i++) sum += nums[i];

        for (int x = k; x< nums.length; x++){

            sum = sum - nums[left] + nums[x];

            if (sum > maxSum) {
                maxSum = sum;
            }
            left++;
        }
        System.out.println(maxSum / k);
    }
}
