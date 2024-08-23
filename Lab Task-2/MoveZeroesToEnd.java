public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 3, 12 };
        int[] result = new int[array.length];

        int nonZeroIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[nonZeroIndex] = array[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < array.length) {
            result[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
