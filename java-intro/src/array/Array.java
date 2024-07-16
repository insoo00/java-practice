package array;

public class Array {
    public static void main(String[] args) {
        int[] students = new int[]{90, 80, 70, 60};
        System.out.println(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
}
