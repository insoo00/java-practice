package array.problem;

import java.util.Scanner;

public class ArrayPro4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        double average;
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        average = (double) sum / nums.length;

        System.out.println("점수 총합 = " + sum);
        System.out.println("점수 평균 = " + average);
    }
}
