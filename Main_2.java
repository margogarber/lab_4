public class Main_2 {
    public static void main(String[] args) {
        int[] array = {4, -22, 61, -7, -5, -8}; 
        try {
            double average = calAverage(array);
            System.out.println("Середнє арифметичне від’ємних: " + average);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public static double calAverage(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Масив не може бути null.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім.");
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
            throw new IllegalArgumentException("В масиві немає від’ємних елементів з парними номерами.");
        }

        return (double) sum / count;
    }
}

