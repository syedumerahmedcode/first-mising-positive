import java.util.Arrays;

public class App {
        public static void main(String[] args) throws Exception {
                /**
                 * Given an unsorted integer array nums, return the smallest missing positive
                 * intger.
                 * 
                 * You must implement an algorithm that runs on O(n) time and uses constant
                 * extra space.
                 * 
                 * input={1,2,0}
                 * output: 3
                 * Explanation: The numbers in [1,2] range are all in the array.
                 * 
                 * input={3,4,-1,1}
                 * output: 2
                 * Explanation: 1 is in the array but 2 is missing.
                 * 
                 * input={7,8,9,11,12}
                 * output: 1
                 * Explanation: The smallest positive integer 1 is missing.
                 */
                System.out.println("Hello, World!");
                Solution solution = new Solution();
                int[] nums = { 1, 2, 0 };
                int firstMissingPositive = solution.firstMissingPositive(nums);
                System.out.println("The given input is: " + Arrays.toString(nums)
                                + " and the first missing positive number is: " + firstMissingPositive);
                System.out.println();

                int[] secondNums = { 3, 4, -1, 1 };
                firstMissingPositive = solution.firstMissingPositive(secondNums);
                System.out.println("The given input is: " + Arrays.toString(
                                secondNums)
                                + " and the first missing positive number is: " + firstMissingPositive);
                System.out.println();

                int[] thirdNums = { 7, 8, 9, 11, 12 };
                firstMissingPositive = solution.firstMissingPositive(thirdNums);
                System.out.println("The given input is: " + Arrays.toString(
                                thirdNums)
                                + " and the first missing positive number is: " + firstMissingPositive);
                System.out.println();
        }
}
