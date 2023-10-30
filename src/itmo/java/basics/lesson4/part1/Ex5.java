package itmo.java.basics.lesson4.part1;

public class Ex5 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 8, 9, 4, 3};
        int[] nums2 = {3, 15, 24, 1, -8, 5, 0};
        int[] nums3 = {3, 58, 45, -53, 11, 25, 12, 3};
        int[] nums4 = {184, 66, -55, 3, 12, 111, 89, -4};

        printAndCheckArray(nums1);
        printAndCheckArray(nums2);
        printAndCheckArray(nums3);
        printAndCheckArray(nums4);
    }

    private static void printAndCheckArray(int[] array) {
        if (array.length >= 2) {
            System.out.print("array: ");
            for (int i : array) {
                System.out.print(i + ", ");
            }
            System.out.println((array[0] == 3 || array[array.length - 1] == 3));
        } else {
            System.out.println("Массив слишком мал!");
        }
    }
}
