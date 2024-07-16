package array.problem;

import java.util.Scanner;

public class ArrayPro6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        int minNum;
        int maxNum;

        System.out.println(size + "개의 정수를 입력하세요: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        minNum = maxNum = nums[0];
        for (int i = 0; i < size; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);

    }
}
