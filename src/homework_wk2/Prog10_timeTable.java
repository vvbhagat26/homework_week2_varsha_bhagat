package homework_wk2;

import java.util.Scanner;

public class Prog10_timeTable {
    //timetable
    public static void main(String[] args) {
        int user_input,ans;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter user_input");
        user_input=obj.nextInt();
        for(int i=1;i<=10;i++)
        {
            ans=user_input*i;
            System.out.println(user_input + "*" +i +"=" + (user_input*i));
        }

    }
}
