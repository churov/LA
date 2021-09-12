
public class Task2 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 13, 8, 6};
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент массива равен: " + max);
    }
}
