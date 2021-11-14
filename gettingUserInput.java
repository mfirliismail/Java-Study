import java.util.Scanner;

public class gettingUserInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter a decimal numberr : ");
        // double number = input.nextDouble();


        // System.out.println("Your number is :" + number)
        int number = 0;
        do{
            System.out.println("Enter a number: ");
            number = input.nextInt();

        }while(number != 9);
        System.out.println("You got 9!");
        

    }
}
