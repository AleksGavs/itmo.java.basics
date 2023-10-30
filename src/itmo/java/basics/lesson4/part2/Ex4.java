package itmo.java.basics.lesson4.part2;

public class Ex4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 2};//3
        int[] nums2 = {22, 15, 24, 1, 24, 15, 22};//1
        int[] nums3 = {-40, -4, 45, 1, -40, -4};//45
        int[] nums4 = {45, 53, 71, 71, 45, 53};//
        int[] nums5 = {1, 1, 1, 5, 5, 66};//66

        displayFirstUniqueNumber(nums1);
        displayFirstUniqueNumber(nums2);
        displayFirstUniqueNumber(nums3);
        displayFirstUniqueNumber(nums4);
        displayFirstUniqueNumber(nums5);
    }

    public static void displayFirstUniqueNumber(int[] array) {
        Integer unique = null;
        for (int i = 0; i < array.length; i++) {//
            if (unique != null) {
                break;
            } else {
                for (int j = 0; j < array.length; j++) {
                    if (i == j && i == array.length - 1) {
                        unique = array[i];
                        break;
                    } else if (i == j) {
                        continue;
                    } else {
                        if (array[i] == array[j]) {
                            break;
                        }
                        if (j == array.length - 1) {
                            unique = array[i];
                        }
                    }
                }
            }
        }
        if (unique == null) {
            System.out.println("Нет уникальных значений");
        } else {
            System.out.println(unique);
        }
    }
}
