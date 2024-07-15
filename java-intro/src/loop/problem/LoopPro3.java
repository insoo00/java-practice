package loop.problem;

public class LoopPro3 {
    public static void main(String[] args) {
        int max = 10;

        int sum = 0;
        int index = 1;
        while (index <= max) {
            sum += index;
            index++;
        }
        System.out.println("sum = " + sum);

        sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

    }
}
