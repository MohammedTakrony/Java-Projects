package com.company;

public class Main {

    public static void main(String[] args) {


        for ( int i = 2; i<9; i++){


            System.out.println("1000 at "+ i + "% is = "+ cal(1000,i)+ "%");
        }
        for ( int i = 8; i>1; i--){


            System.out.println("1000 at "+ i + "% is = "+String.format( "%.2f", cal(1000,i)));
        }
       int count = 0;
        for (int i=10; i<50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("The number "+i+" is the prime");
                if(count == 5){
                    break;
                }
            }
        }


        }
        public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i=2; i<=n/2; i++){
            if (n % i ==0){
                return false ;
            }

        }
        return true;
        }
    public static double cal(double amount, double rate){
return amount *(rate/100);
        // write your code here
    }
}
