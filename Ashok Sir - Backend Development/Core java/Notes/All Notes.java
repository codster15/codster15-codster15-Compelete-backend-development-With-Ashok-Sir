


=======================================================

                Sum OF Number

import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
        int a ;
        int b ;
        int sum = 0;

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = read.nextInt();

        System.out.print("Enter another number: ");
        int number2 = read.nextInt();

        sum = number + number2;

        System.out.println("The sum is: " + sum);

        read.close();





    }
}


============================================================

.           OddEven program


import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        int store ;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter Any Number ");
        store = read.nextInt();


        if(store % 2 == 0){
            System.out.println("this is even number = " + store);

        }else {
            System.out.println("Not a Even number = " + store);
        }
    }
}


=============================================================================

        Divisible By 5

        import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args){
        int sum ;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter any number - ");
        sum = read.nextInt();

        if(sum % 5 == 0 ){
            System.out.print("Number is completly divisible by 5 = " + sum);
        }else{
            System.out.println("NOt divisible by 5 - "+ sum);
        }
    }
}

============================================================================

                    Day 3

3rd jan 2023

        Prime number



import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int no ;
        int count = 0 ;
        Scanner readNo = new Scanner(System.in);

        System.out.print("Enter the number - ");
        no = readNo.nextInt();

        if(no > 1){

            for (int i  = 1 ; i <= no ; i++){
                if(no % i == 0 ){
                    count++;

                }

            }
            System.out.println(count);
            if (count == 2){
                System.out.println("This is a prime number");
            }else {
                System.out.println(" Not A prime number ");
            }

        }else{
            System.out.println("Number Cannot be less than zero");
        }


    }

}


-------------------------------------------------------

    program 1       check given charater is alphabet or digit


import java.util.Scanner;
public class CharacterOrDigit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter any character ");
        char store = read.next().charAt(0);

        if ((store >= 'a' && store <= 'z') || (store >= 'A' && store <= 'Z')) {
            System.out.println(store + " is an alphabet character.");
        } else if (store >= '0' && store <= '9') {
            System.out.println(store + " is a digit.");
        } else {
            System.out.println(store + " is neither an alphabet character nor a digit.");
        }

        read.close();
    }
}
================================================================================


.               4 Day (4 jan 2024)

program 1

write a brand name based on brand name sologan needs to be printed along with brand name 


   import java.util.Scanner;



    public class SwitchCaseSHowBrandName {
        public static void main(String[] args) {
            Scanner readUser = new Scanner(System.in);
            System.out.println("Enter the Brand Name Here ");
            String store = readUser.next();
            String brandName = store;

            switch (brandName){
                case "nike" :
                    System.out.println("NIke -> Just DO it ");
                    break;

                case "Adidas" :
                    System.out.println(" Impossible is Nothing ");
                    break;

                case "Puma" :
                    System.out.println(" Forever Faster ");
                    break;

                case "Reebok" :
                    System.out.println("NIke -> Just DO it ");
                    break;

                default:
                    System.out.println(" Enter the correct Brand Name ");
            }
        }
    }
    
    -----------------------------------------------------------------------------

    program 2

    calculate pf from basic salry



 import java.util.Scanner;
        public class CalculateBasicSalary {
            public static void main(String[] args) {
                Scanner read = new Scanner(System.in);
                System.out.println(" Enter the basic Salary ");
                    int sal = read.nextInt();
                    int pf = 12 * sal / 100 ;
                    System.out.println( "Provident Fund - " + pf + "Rs Of your basic salary " + sal);
            }
        }
-----------------------------------------------------------


program 3

read preson age and sallry to check marriage eligibilty



import java.util.Scanner;
public class PersonAgeSalaryMarriage {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the your age ");
        int age  = read.nextInt();

        int sal ;


        if(age < 30){
            System.out.println(" Enter Your Salary ");
             sal = read.nextInt();

                 if(sal > 100000){
                     System.out.println("Congratulation You are Eligible for Marriage");
                 }else{
                     System.out.println(" You are Not Eligible for Marriage ");
                 }

        }else{
            System.out.println(" You are Not Eligible for Marriage ");
        }



    }
}
-----------------------------------------------------------

program 4

factorial of given number



import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter Any Number ");
        int store = read.nextInt();
        int show = store ;

        int fac = 1;
        while(store >= 1){


            fac = fac * store;
            store-- ;


        }
        System.out.println("Factorial of "+ show +" is = " + fac );
    }
}
------------------------------------------------------=

program 5

table


import java.util.Scanner;
public class MathmaticalTable {

    public static void main(String[] args) {

            Scanner read = new Scanner(System.in);

            System.out.println(" Enter the numer to see table ");
                int num = read.nextInt();

                for (int i = 1 ; i <= 10 ; i ++){

                    int table = num *  i ;
                    System.out.println(num + " x " + i + " = " + table );
                }
    }

}
 ----------------------------------------------------

 proghram 6

 print the number 100 to 1

 public class PrintNumber {
    public static void main(String[] args) {

        int num = 100;

        while(num >= 1){
            System.out.println(num);
                num--;
        }
    }
}
 ----------------------------------------------------

 program 7

 sum of digit

 
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter Any Digit Below To get the Sum ");
            int no = read.nextInt();
            int sum  = 0 ;
            while(no > 0){

                int rem = no % 10 ;
                sum += rem ;

               no = no / 10 ;



            }
            System.out.println("Sum of digit - " + sum);
    }
}


--------------------------------------------------------

program 8


w r t a program to check Armstrong  Number


import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println(" Enter number " );
        int no = read.nextInt();
        int arm = no ;
        int value = no ;
        int temp ;
        int count = 0 ;
        int StoreNumber = 0;


        while (no > 0){

            int rem = no % 10 ;
            count++ ;

            no  = no / 10 ;




        }

        while(value > 0){
            int rem2 = value % 10 ;


            temp = (int) Math.pow(rem2 , count);
            StoreNumber += temp;



            value = value / 10 ;

        }
        if(StoreNumber == arm){

            System.out.println("this is Armstrong Number - " + StoreNumber);
        }else {


            System.out.println("Not a Armstrong Number - "  + StoreNumber);
        }


    }
}
---------------------------------------------------------

proram 9

print prime number 1 to 100

public class PrimeNumberlist {
    public static void main(String[] args) {


        int no = 1;
        while(no < 100){



            int temp = 0;
            int count = 0;


            for (int i = 1; i <= no ; i++){
                temp = no % i ;

                if(no % i == 0){
                    count++;

                }

            }
            if(count == 2){
                System.out.println(" prime number -----------" + no);
            }




            no++;
        }


    }
}


+++++++++++++++++++++++++++++++++++++++++++++++++++

public class PrintNumber {
    public static void main(String[] args) {

        int num = 100;

        while(num >= 1){
            System.out.println(num);
                num--;
        }
    }
}

--------------------------------------------------------------

program 10

print the paterns 

public class printStart {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++  ){

            for(int j = 1; j <= 5 ; j ++){
               System.out.print( "*  ");

            }
            System.out.println();
        }
    }
}


----------------------------------------------------------


paterns pyramid

public class Piramid {
    public static void main(String[] args) {

int n = 5;
        for(int i=1; i <= n ; i++ ){

               for(int j = 5 ; j >= i; j--){
                   System.out.print("  ");
               }

               for(int a = 0; a < i ; a++ ){
                   System.out.print(" @  ");
               }




          System.out.println();

           }
        }
    }


---------------------------------------------------------------

patern part 2

public class Starpart2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++  ){



            for(int j = 5; j >= i ; j--){


                System.out.print( "  ");


            }
            for(int a = 1; a <= i ; a++){


                System.out.print( " *");


            }

            System.out.println();
        }

    }

}
-----------------------------------------------------------------