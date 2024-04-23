package homework_wk2;

import java.util.Scanner;

public class Prog14AreaPereRectangle {
    //using scanner
    public static void main(String[] args) {
        float length,width,area,perimeter;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter length ");
        length=obj.nextFloat();
        System.out.println("Enter width ");
        width=obj.nextFloat();
        area=length*width;
        System.out.println("Area is " + width + " * " + length + " = " + area);
        perimeter=2*(length+width);
        System.out.println("Perimeter is " + width + " * " + length + " = " + perimeter);
    }
}
