package homework_wk2;

import java.util.Scanner;

public class Prog6_Area {
    //Area of a circle
    public void area(int r)
    {
        double area;
        float pi=3.14f;
        area = pi*r*r;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Scanner myarea= new Scanner(System.in);
        System.out.println("enter r");
        int r = myarea.nextInt();

        Prog6_Area mainobj=new Prog6_Area();
        mainobj.area(r);
    }

}
