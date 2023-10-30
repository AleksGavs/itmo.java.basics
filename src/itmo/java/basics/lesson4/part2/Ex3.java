package itmo.java.basics.lesson4.part2;

public class Ex3 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 8, 9, 4, 12};
        int[] nums2 = {22, 15, 24, 1, -8, 5, 3};
        int[] nums3 = {-40, -4, 1, 45, 53, 11};
        int[] nums4 = {-40, -4, 1, 45, 53, 71, 118};

        changeFirstAndLast(nums1);
        changeFirstAndLast(nums2);
        changeFirstAndLast(nums3);
        changeFirstAndLast(nums4);
    }

    public static void changeFirstAndLast(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        int tempNum = temp[0];
        temp[0] = temp[temp.length - 1];
        temp[temp.length - 1] = tempNum;
        displayArray(array, 1);
        displayArray(temp, 2);
    }

    public static void displayArray(int[] array, int i) {
        System.out.print("Array " + i + ": [ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print(" ]\n");
    }
}
