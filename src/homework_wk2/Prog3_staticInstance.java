package homework_wk2;

public class Prog3_staticInstance {
/** 3.1 Declare one instance and one static variable.
 3.2 Declare one instance method.
 3.3 Declare one static method.
 3.4 Call both instance and static variables into both instance and static methods inside the
 print statement.
 3.5 Declare the Main method.
 3.6 Call both instance and static methods into the Main method and run the programme.*/

    int a=40;
    static int b=80;

    public void display1()
    {
        System.out.println(a);
        System.out.println(Prog3_staticInstance.b);

    }
    public static void display2()
    {
        Prog3_staticInstance obj1=new Prog3_staticInstance();
        System.out.println(obj1.a);
        System.out.println(b);

    }

    public static void main(String[] args) {

        Prog3_staticInstance obj=new Prog3_staticInstance();
        obj.display1();
        display2();


    }




}
