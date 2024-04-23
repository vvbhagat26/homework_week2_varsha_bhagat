package homework_wk2;

import java.util.Scanner;

public class Prog20_Print {
    //display data

public static void displaydata (String title,String date,String time,double gval,double gPrice,float fTotal) {

    System.out.println("'' +----------------------------------+''");
    System.out.println("''|                                   |''");
    System.out.println("''|            " + title + "              |''");
    System.out.println("''|                                   |''");
    System.out.println("''|      " + date + " " + time + "              |''");
    System.out.println("''|                                   |''");
    System.out.println("''|    Gallons:  " + gval + "             |''");
    System.out.println("''|   Price/gallon: " + " $" + gPrice + "      |''");
    System.out.println("''|                                   |''");
    System.out.println("''|    Fuel total: " + "$" + fTotal + "           |''");
    System.out.println("''|                                   |''");
    System.out.println("'' +----------------------------------+''");
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter title:");
        String title= sc.nextLine();
        System.out.println("enter date:");
        String date= sc.nextLine();
        System.out.println("enter time:");
        String time= sc.nextLine();
        System.out.println("enter gval:");
        double gval= sc.nextDouble();
        System.out.println("enter gPrice:");
        double gPrice= sc.nextDouble();
        System.out.println("enter fuel total:");
        float  fTotal= sc.nextFloat();
        displaydata(title,date,time,gval,gPrice,fTotal);

    }





}


