import java.util.*;
public class FindTwoNumbersForSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int targetSum = 9;

       
        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) {
                System.out.println("Numbers that add up to the target sum: " + array[left] + ", " + array[right]);
                break;
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
    }
}
