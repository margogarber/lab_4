public class main_3 {
    public static void main(String[] args) {
        int[] arrayA = {1, 16, 28}; 
        int[] arrayB = {2, 17, 29}; 

        try {
            int[] mergedArray = mergeArrays(arrayA, arrayB);
            System.out.print("Merged array: ");
            for (int num : mergedArray) {
                System.out.print(num + " ");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new NullPointerException("One of the arrays cannot be null.");
        }
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        int n = a.length;
        int[] merged = new int[2 * n];

        for (int i = 0; i < n; i++) {
            merged[2 * i] = a[i];
            merged[2 * i + 1] = b[i];
        }

        return merged;
    }
}
