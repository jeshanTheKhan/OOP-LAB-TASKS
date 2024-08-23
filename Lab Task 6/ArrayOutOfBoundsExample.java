public class ArrayOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int index = 2; 
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayOutOfBounds: " + e.getMessage());
        }
    }
}
