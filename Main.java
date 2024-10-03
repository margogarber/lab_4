public class Main {
    public static void main(String[] args) {
        int[] array = {4, 22, 61, -7, -5}; 
        try {
            int diff = calDiff(array);
            System.out.println("Різниця: " + diff); 
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public static int calDiff(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Масив не може бути null.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім.");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}

