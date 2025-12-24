package MediumProblems;

import java.util.*;

public class ThreeSum {

    static void main() {

        int[] nums3 = {-100, -70, -60, 110, 120, 130, 160};
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {-4, -1, -1, 0, 1, 2};

        //[] sortedNums = nums.clone();
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            int need = 0 - nums[i];

            while (left < right) {

                int sum = nums[left] + nums[right];
                if (sum == need) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;

                } else if (sum < need) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(result);
    }
}



        /*
        -----------------BRUTE FORCE SOLUTİON-----------------

        Set<List<Integer>> resultSet = new HashSet<>();

        int n = nums.length;

        for (int i0 = 0; i0 < n - 2; i0++) {
            for (int i1 = i0 + 1; i1 < n - 1; i1++) {
                for (int i2 = i1 + 1; i2 < n; i2++) {
                    if (nums[i0] + nums[i1] + nums[i2] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i0], nums[i1], nums[i2]);
                        Collections.sort(temp);
                        resultSet.add(temp);
                    }
                }
            }
        }
        System.out.println(resultSet);
        */

