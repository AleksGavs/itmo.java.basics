package itmo.java.basics.lesson4.part2;

public class Ex1 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 8, 9, 4, 12};
        int[] nums2 = {22, 15, 24, 1, -8, 5, 3};
        int[] nums3 = {-40, -4, 1, 45, 53, 11};
        int[] nums4 = {-40, -4, 1, 45, 53, 71, 118};

        checkIfSorted(nums1);
        checkIfSorted(nums2);
        checkIfSorted(nums3);
        checkIfSorted(nums4);
    }

    public static void checkIfSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Please, try again later.");
                break;
            } else {
                if (i == array.length - 2) {
                    System.out.println("OK");
                }
            }
        }
    }
}
