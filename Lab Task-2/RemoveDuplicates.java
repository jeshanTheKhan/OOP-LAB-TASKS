public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 2, 3, 4, 5, 5};
        int[] uniqueArray = new int[originalArray.length];
        int uniqueCount = 0;

        for (int i = 0; i < originalArray.length; i++) {
            if (i == 0 || originalArray[i] != originalArray[i - 1]) {
                uniqueArray[uniqueCount] = originalArray[i];
                uniqueCount++;
            }
        }

        System.out.print("Original Array: [ ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        System.out.print("Array with Duplicates Removed: [ ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        System.out.println("]");
    }
}
