package scanner.problem;

import java.util.Scanner;

public class ScannerPro9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        double average = 0.0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            cnt++;
            sum += num;
        }
        average = (double) sum / cnt;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
