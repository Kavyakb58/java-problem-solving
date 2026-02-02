package loops;

public class FactorialOfNumbers {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int temp=n;

//        //Approach 1
//        for(int i=5; i>=1; i--){
//            fact=fact*i;
//        }
//        System.out.println( temp+"! = "+fact);
//    }


//        //Approach 2
//        while (n >= 1) {
//            fact = fact * n;
//            n--;
//        }
//        System.out.println(temp + "! = " + fact);
//    }
//
        //Approach 3
        do {
            fact = fact * n;
            n--;
        } while (n >= 1);
        System.out.println(temp + "! = " + fact);

    }
}
