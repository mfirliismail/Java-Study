import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //varable support switch statement is  char, byte, short, int, and string 

        System.out.println("Please Enter Your intructions: ");
        String text = input.nextLine();

        switch(text) {
            case "run":
                System.out.println("Program running...");
                break;
            case "stop":
                System.out.println("Program Stopped");
                break;
            default: 
                System.out.println("Intructions not recognized");

        }


    }
}
