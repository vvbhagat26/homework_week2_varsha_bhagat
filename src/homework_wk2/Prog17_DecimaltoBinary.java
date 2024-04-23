package homework_wk2;

import java.util.Scanner;

public class Prog17_DecimaltoBinary {
    // convert decimal to binary

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter num");
        int num = obj.nextInt();
        System.out.println(Integer.toBinaryString(num));

    }

}
