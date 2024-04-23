package homework_wk2;

import java.util.Scanner;

public class Prog18_Calculation {
    //Calculator functions

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a");
        int a= obj.nextInt();
        System.out.println("enter ");
        int b= obj.nextInt();

        Prog18_Calculation cs=new Prog18_Calculation();
        addition(a,b);
        substraction(a,b);
        multiplication(a,b);
        division(a,b);
        modulo(a,b);

    }
    public static void addition(int a,int b)
    {
        int ans = a+b;
        System.out.println(a+" + "+b+" = " + ans);
    }
    public static void substraction(int a,int b)
    {
        int ans = a-b;
        System.out.println(a+" - "+b+" = " + ans);
    }
    public static void multiplication(int a,int b)
    {
        int ans = a*b;
        System.out.println(a+" * "+b+" = " + ans);
    }
    public static void division(int a,int b)
    {
        int ans = a/b;
        System.out.println(a+" / "+b+" = " + ans);
    }
    public static void modulo(int a,int b)
    {
        int ans = a%b;
        System.out.println(a+" % "+b+" = " + ans);
    }
}
