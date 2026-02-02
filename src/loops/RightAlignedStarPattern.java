package loops;

public class RightAlignedStarPattern
{
    public static void main(String[] args){
        int r=5;

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }

            // new line
            System.out.println();
        }
    }
}
