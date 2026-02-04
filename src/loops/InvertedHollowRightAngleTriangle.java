package loops;

public class InvertedHollowRightAngleTriangle {
    public static void main(String[] args) {
        int r = 5;
        for(int i=r; i>=1; i--){
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i==r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }}