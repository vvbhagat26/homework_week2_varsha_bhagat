package homework_wk2;

public class Prog4_Staticinstance {

// four instance and two static method calling


    int a=30;
    int b=10;
    static int c=20;
    static int d=40;

    public void print1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println( Prog4_Staticinstance.c);
        System.out.println( Prog4_Staticinstance.d);
    }

    public static void print2(){
        Prog4_Staticinstance obj1=new Prog4_Staticinstance();
        System.out.println( obj1.a);
        System.out.println( obj1.b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Prog4_Staticinstance objmain=new  Prog4_Staticinstance();
        objmain.print1();
        print2();
    }
}
