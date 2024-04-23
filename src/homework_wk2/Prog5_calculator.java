package homework_wk2;

import java.util.Scanner;

public class Prog5_calculator {
    //calculator

    public static void addition(int a,int b) {

        int ans = a + b;
        System.out.println(ans);
    }

    public static void substraction(int a,int b) {

       int ans = a - b;
        System.out.println(ans);
    }

    public void  multiplication(int a,int b) {

         int ans = a * b;
        System.out.println(ans);
    }

    public void division(int a,int b) {

        try {
            int ans = a / b;
            System.out.println(ans);
        } catch (ArithmeticException e){
            System.out.println("error");
        }
    }


    public static void main(String[] args) {
        Scanner user_input= new Scanner(System.in);

        System.out.println("enter a");
        int a = user_input.nextInt();

        System.out.println("enter b");
        int b= user_input.nextInt();

        Prog5_calculator obj = new Prog5_calculator();
        addition(a,b);
        substraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);

    }

    }