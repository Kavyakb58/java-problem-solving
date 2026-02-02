package loops;

public class DimondStarPattern
{
    public static void main(String[] args){
        int r=5;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i=r-1; i>=1; i--){
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
