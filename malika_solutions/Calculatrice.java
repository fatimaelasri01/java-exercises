package malika_solutions;
import java.util.Scanner;
public class Calculatrice {
    public static void main(String[] args)
    {
        double nb1;
        double nb2;
        char op;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the first number :");
            nb1 = scanner.nextInt();
            System.out.println("Enter the second number :");  
            nb2 = scanner.nextInt();
            System.out.println("Choose the operation you need to effectuer\n + : Addition\n - : Soustraction\n * : Multiplication\n / : Division\n % : Modulo");
            op = scanner.next().charAt(0);
            switch (op) {
                case '+':
                    System.out.println("The result is "+addition.addit(nb1, nb2));
                    break;
                case '*':
                    System.out.println("The result is "+multiplacation.multipli((int)nb1, (int)nb2));
                    break;
                case '-':
                    System.out.println("The result is "+soustraction.soustract(nb1, nb2));
                    break;
                case '/':
                    System.out.println("The result is "+division.divise(nb1, nb2));
                    break;
                case '%':
                    System.out.println("The result is "+modulo.mod((int)nb1, (int)nb2));
                    break;
                default:
                    System.out.println("Please enter one of this operators");
                    break;
            }
            System.out.println("Do you want to do an other operation (y/n)");
            char c = scanner.next().charAt(0);
            if (c != 'y' && c != 'Y')
                break;
        } while(true);
        scanner.close();
    }
}
