package homework_wk2;

import java.util.Scanner;

public class Prog15_swapVariables {
    //Swapping numbers
    public static void main(String[] args) {
            int x;
            int y;
            int t;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter x");
        x= obj.nextInt();
        System.out.println("Enter y");
        y= obj.nextInt();
        System.out.println(("Before swapping " +x +","+y));

      //perform swapping
        t=x;
        x=y;
        y=t;
        System.out.println("After swapping "+x +","+y);

    }
}
