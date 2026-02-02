package loops;

import java.util.Scanner;

public class PrintEvenNum1To50
{
    public static void main(String[] args){
//        int i=1;
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        /*
        //Approach 1
        while(i<=50) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
            i++;
        }



        //Approach 2
        do{
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }while(i<=50);

         */

        //Approach 3
        for(i=1; i<=50; i++){
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            }
        }
    }

