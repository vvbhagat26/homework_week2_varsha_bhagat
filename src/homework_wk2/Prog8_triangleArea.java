package homework_wk2;

import java.util.Scanner;

public class Prog8_triangleArea {
    //triangle area
    public static void main(String[] args) {
        float b,h;
        float ans;
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter b");
        b= obj.nextFloat();
        System.out.println();
        System.out.println("Enter h");
        h= obj.nextFloat();
        ans=(b*h)/2;
        System.out.println("Area is" + ans);

    }

}
