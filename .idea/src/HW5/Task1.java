package HW5;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum = sum + array[i];

        }
        System.out.println("Сумма значений элементов массива равна: " + sum);
    }
}