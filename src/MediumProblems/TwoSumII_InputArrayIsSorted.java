package MediumProblems;

public class TwoSumII_InputArrayIsSorted {

    static void main() {

        int[] numbers = {2, 7, 11, 15, 18};
        int target = 18;

        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer < rightPointer) {

            int temp = numbers[leftPointer] + numbers[rightPointer];
            if (temp > target) {
                rightPointer--;
            } else if (temp < target) {
                leftPointer++;
            }
            if (temp == target) {

                leftPointer++;
                rightPointer++;
                System.out.println("Left: " + leftPointer);
                System.out.println("Right: " + rightPointer);
                break;
            }
        }

    }
}
