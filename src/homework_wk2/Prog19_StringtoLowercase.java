package homework_wk2;

import java.util.Scanner;
// convert upper to lower case
public class Prog19_StringtoLowercase {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("user_input");
        String user_input=obj.nextLine();

        //string to lower case
        System.out.println("write in upper case");
        String lower=user_input.toLowerCase();
        System.out.println("lower case is " + lower);

    }
}
