package loops;
public class PrintNum1To10
{
    public static void main(String[] args){
        int i=1;

        //Approach 1
        /*
        while(i<=10){
            System.out.print(i);
            i++;
        }

        //Approach 2
        do {
            System.out.print(i);
            i++;
        }while(i<=10);

         */


        //Approach 3
        for(i=1; i<=10; i++){
            System.out.print(i+" ");
        }
    }
}

