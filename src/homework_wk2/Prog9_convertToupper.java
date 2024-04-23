package homework_wk2;

import java.util.Scanner;

public class Prog9_convertToupper {
    //convert to upper

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter in upper case");
        String up=sc.nextLine();
        String lc=up.toLowerCase();
        System.out.println("lower case is "+ lc);
    }
}
