package cond.problem;

public class CondPro3 {

    public static void main(String[] args) {
        int dollar = 5;
        int rate = 1300;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * rate;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }
}
