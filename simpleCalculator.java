import java.util.Scanner;

public class simpleCalculator {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int x = sc.nextInt();
        System.out.println("Enter Second number: ");
        int y = sc.nextInt();
        System.out.println(" + , - , * , / ");
        System.out.println("Select a operator to perform: ");
        char operator = sc.next().charAt(0);
        int result;



        switch (operator) {
            case '+':
                result = x + y;
                System.out.println("Answer : " +result);
                break;
            case '-':
                result = x - y;
                System.out.println("Answer : " +result);
                break;
            case '*':
                result = x * y;
                System.out.println("Answer : " +result);
                break;
            case '/':
                result = x / y;
                System.out.println("Answer : " +result);
                break;
        
            default:
                System.out.println("Enter a valid Operator");
                break;
        }

    }
}
