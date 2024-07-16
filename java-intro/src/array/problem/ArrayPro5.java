package array.problem;

import java.util.Scanner;

public class ArrayPro5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        int sum = 0;
        double average;

        System.out.println(size + "개의 정수를 입력하세요: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        average = (double) sum / size;

        System.out.println("점수 총합 = " + sum);
        System.out.println("점수 평균 = " + average);
    }
}
