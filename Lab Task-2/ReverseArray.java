public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {5, 3, 9, 2, 1, 7};
        int[] reversedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        System.out.print("Original Array: [ ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        System.out.print("Reversed Array: [ ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
