public class FindMaxMinInArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 2, 1, 7};

    
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i]; 
            }
        }

      
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
