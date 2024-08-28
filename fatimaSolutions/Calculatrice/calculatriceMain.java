package fatimaSolutions.Calculatrice;

import java.util.Scanner;

public class calculatriceMain {

    public static void main(String[] args) {
        int operateur;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");
            System.out.println("Choisissez une opération : ");
            operateur = sc.nextInt();
            if (operateur == 5) {
                System.out.println("Au revoir !");
                break;
            }
            System.out.println("Entrez le premier nombre : ");
            int nb1 = sc.nextInt();
            System.out.println("Entrez le deuxième nombre : ");
            int nb2 = sc.nextInt();
            switch (operateur) {
                case 1:
                    System.out.printf("%d + %d = %d %n", nb1, nb2, Addition.addition(nb1, nb2));
                    System.out.println("--------------------------------");
                    break;
                case 2:
                    System.out.printf("%d - %d = %d %n", nb1, nb2, Soustraction.soustraction(nb1, nb2));
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    System.out.printf("%d * %d = %d %n", nb1, nb2, Multiplication.multiplication(nb1, nb2));
                    System.out.println("--------------------------------");
                    break;
                case 4:
                    if (nb2 == 0) {
                        System.out.println("Division par zéro impossible");
                        System.out.println("--------------------------------");
                    } else {
                        System.out.printf("%d / %d = %d %n", nb1, nb2, Division.division(nb1, nb2));
                        System.out.println("--------------------------------");
                    }
                    break;
                default:
                    System.out.println("Opération invalide");
                    System.out.println("--------------------------------");
                    break;
            }
        }
        sc.close();
    }
}