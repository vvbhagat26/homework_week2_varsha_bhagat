package homework_wk2;

public class Prog2_StaticCalling {
    /**2.1 Declare two static variables
     2.2 Declare one static method
     2.3 Call both static variables into the static method inside the print statement.
     2.4 Declare the Main method.
     2.5 Call the static method into the Main method and Run the programme.*/

   static int a=10;
   static int b=30;

   public static void display(){
       System.out.println(a);
       System.out.println(b);
   }

    public static void main(String[] args) {
        display();
    }

}
