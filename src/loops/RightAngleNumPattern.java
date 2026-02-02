package loops;

import java.util.Scanner;

public class RightAngleNumPattern
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of Rows: ");
        int r=sc.nextInt();
        System.out.println("Num of Rows: " +r);
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
