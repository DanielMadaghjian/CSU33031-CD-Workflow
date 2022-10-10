import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finished = false;
        do
        {
            System.out.println("Please choose option:");
            System.out.println("1) Addition \n");
            System.out.println("1) Multiplication \n");
            System.out.println("3) Exit \n");

            int choice = scanner.nextInt();
            switch(choice){
                case 1:

            }
            int number1 = scanner.nextInt();
            System.out.println("Enter integer 2:");
            int number2 = scanner.nextInt();

            System.out.println("multiply or add or exit?");
            String answer = scanner.next();
            int result = 0;
            switch(answer){
                case "multiply":
                    result = number1 * number2;
                    break;
                case "add":
                    result = number1 + number2;
                    break;
                case "exit":
                    finished = true;
                    break;
                default:
                    result = -1;
                    break;
            }
            if(!finished) {
                System.out.println("The result is " + result);
            }
        } while(!finished);

    }
}