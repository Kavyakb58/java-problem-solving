package loops;

public class InvertedRightAnglePattern {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            // print leading spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }
    }
}
