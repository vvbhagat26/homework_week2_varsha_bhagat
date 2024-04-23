package homework_wk2;

import java.util.Scanner;

public class Prog16_AddBinary {
    //Add two binary numbers


    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter x");
        String x =obj.nextLine();
        System.out.println("enter y");
        String y= obj.nextLine();

        //convert binary string to integer(decimal)
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);

                // Add num1,num2
        int result=num1+num2;
        System.out.println(Integer.toBinaryString(result));


    }


}
