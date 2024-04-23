package homework_wk2;

import java.util.Scanner;

public class Prog7_temperature {
    //Teperature conversion

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temp. in ferenite");
    double f = sc.nextDouble();
    double celcius =(f - 32) * 5/9;
    System.out.println("Temperature in celcious=" + celcius);
}
}
