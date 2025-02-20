public class Main_2 {
    public static void main(String[] args) {
        int[] array = {4, -22, 61, -7, -5, -8}; 
        try {
            double average = calAverage(array);
            System.out.println("Arithmetic mean of negative values: " + average);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public static double calAverage(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] < 0) {
                sum += arr[i];
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("There are no negative elements with even numbers in the array..");
        }

        return (double) sum / count;
    }
}

