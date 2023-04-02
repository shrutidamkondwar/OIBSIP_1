import jdk.dynalink.Operation;

import java.util.Scanner;

public class ORS3 {
    public static void main(String args[]){
        ORS2 op = new ORS2();
        int userid = 12345;
        int password = 54321;
        int train_no = 1432;
        Scanner in = new Scanner(System.in);

        System.out.println("***** Welcome to online reservation system *****\n");
        System.out.println("Enter userid: ");
        int id = in.nextInt();
        System.out.println("Enter password: ");
        int pin = in.nextInt();
        System.out.println("Enter train no: ");
        int no = in.nextInt();
        if((userid==id)&&(password==pin)){
            while (true){
                System.out.println("1.train name\n 2.class type\n 3.date of journey\n 4.from to destination");
                System.out.println("Enter choice: ");
                int ch = in.nextInt();
                if (ch==1){
                    System.out.println("train name is: ");
                    op.train_name();
                    System.out.println("Maharashtra Express");
                } else if (ch==2) {
                    System.out.println("class type is: ");
                    op.class_type();
                    System.out.println("1st AC");
                } else if (ch==3) {
                    System.out.println("date of journey: ");
                    op.date_of_journey();
                    System.out.println(" 2 Apr 2023");
                }
                else if (ch==4){
                    System.out.println("from to destination: ");
                    op.From_To_Destination();
                    System.out.println("nagpur To Pune");
                }
                else{
                    System.out.println("please enter correct choice: ");
                    System.out.println("\n");
                }
            }

        }
        else {
            System.out.println("Invalid username and password");
            System.exit(0);
        }
    }
}
