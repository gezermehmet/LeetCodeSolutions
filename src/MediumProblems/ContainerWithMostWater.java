package MediumProblems;

public class ContainerWithMostWater {

    static void main() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int leftVal = height[left];
            int rightVal = height[right];

            if (leftVal <= rightVal) {
                int tempArea = leftVal * width;

                if (tempArea > maxArea) {
                    maxArea = tempArea;
                }
                left++;

            } else {
                int tempArea = rightVal * width;
                if (tempArea > maxArea) {
                    maxArea = tempArea;
                }
                right--;
            }

        }
        System.out.println(maxArea);



        /*
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;

            maxArea = Math.max(maxArea, currentHeight * width);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
         */
    }


}
