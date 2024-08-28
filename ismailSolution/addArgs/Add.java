package ismailSolution.addArgs;

public class Add {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Aucun argument fourni.");
            return;
        }
        float sum = 0;
        boolean hasErrors = false;
        for (int i = 0; i < args.length; i++) {
            try {
                float number = Float.parseFloat(args[i]);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.printf("Erreur : L'argument à la position %d (%s) n'est pas un nombre.\n", i + 1, args[i]);
                hasErrors = true;
            }
        }
        System.out.printf("La somme est égale à : %.2f\n", sum);
        if (hasErrors) {
            System.out.println("Erreur : Tous les arguments de la ligne de commande doivent être des nombres.");
        }
    }
}
