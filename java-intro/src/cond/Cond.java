package cond;

public class Cond {
    public static void main(String[] args) {


        //new switch condition since java14
        int grade = 3;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("coupon = " + coupon);
    }
}
