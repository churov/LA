//package HW5;

public class Task54 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i =0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Среднее значение массива равно: " + sum*1.0/array.length);
    }
}
