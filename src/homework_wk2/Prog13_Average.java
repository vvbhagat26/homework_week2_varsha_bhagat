package homework_wk2;

import java.util.Scanner;

public class Prog13_Average {
    //find avg
    public static void main(String[] args) {
        int num1,num2,num3;
        float avg;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter num1 ");
        num1 = obj.nextInt();
        System.out.println("Enter num2 ");
        num2 = obj.nextInt();
        System.out.println("Enter num3 ");
        num3 = obj.nextInt();
        avg=(num1+num2+num3)/3;
        System.out.println("The avg of three numbers is " +avg);
    }
}
