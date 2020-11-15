import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean cont = true;

        Scanner scan = new Scanner(System.in);
        while (cont == true) {
            System.out.print("Enter 1st number: ");
            int num1 = scan.nextInt();
            System.out.println();
            System.out.print("Enter 2nd number: ");
            int num2 = scan.nextInt();
            System.out.println();
            System.out.print("Enter the operand: ");
            String op = scan.next();
            System.out.println();
            int result;
            switch (op) {
                case "+":
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case "-":
                    System.out.println(result = num1 - num2);
                    break;
                case "*":
                    System.out.println(result = num1 * num2);
                    break;
                case "/":
                    System.out.println(result = num1 / num2);
                    break;
            }

            System.out.println("Continue?");
            char b = scan.next().charAt(0);
            if (b == 'y' || b == 'Y') {
                cont = true;
            } else if (b == 'n' || b == 'N') {
                cont = false;
                System.out.println("Program ends.");
            } else {
                cont = false;
                System.out.println("Wrong entry. /nProgram ends.");
            }
        }
    }

}