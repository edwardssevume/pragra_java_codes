import java.util.Scanner;

public class WhileLoopCalculatorDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        boolean exit = false;

        while(!exit){
            System.out.println("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.println("Enter operator (+, -, *, /) or 'e' to exit: ");
            operator = scanner.next().charAt(0);
            if(operator == 'e'){
                exit = true;
            }else{
                System.out.println("Enter the second number: ");
                num2 = scanner.nextDouble();

                switch (operator){
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if(num2 == 0){
                            System.out.println("Cannot divide by zero.");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        continue;
                }
                System.out.println("Result:" +result);
            }
        }
        System.out.println("Exiting calculator.");
        scanner.close();
    }
}
