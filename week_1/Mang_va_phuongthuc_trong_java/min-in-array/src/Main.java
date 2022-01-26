public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 5, 12, 6, 8, 23, 9};
        int indexMin = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[indexMin]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
