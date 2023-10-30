package itmo.java.basics.lesson4.part1;

public class Ex6 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 8, 9, 4, 12};
        int[] nums2 = {22, 15, 24, 1, -8, 5, 3};
        int[] nums3 = {13, 1, 45, -53, 11, 25, 12, 3};
        int[] nums4 = {184, 66, -55, 7, 12, 111, 89, -4};

        System.out.println(checkOneOrThree(nums1));
        System.out.println(checkOneOrThree(nums2));
        System.out.println(checkOneOrThree(nums3));
        System.out.println(checkOneOrThree(nums4));
    }

    private static boolean checkOneOrThree(int[] array) {
        boolean hasNum = false;
        for (int i : array) {
            if (i == 1 || i == 3) {
                hasNum = true;
                break;
            } else hasNum = false;
        }
        return hasNum;
    }
}
