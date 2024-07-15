package loop.problem;

public class LoopPro2 {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        while (count < 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        System.out.println();

        count = 0;
        for (int n = 1; count < 10; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
                count++;
            }
        }
    }
}
