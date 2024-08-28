package fatimaSolutions.addArgs;

public class Option1 {
    public static void sumNum(String[] ar) {
        float sum = 0, nb;
        int i = 0;

        try {
            while (i < ar.length ) {
                nb = Float.parseFloat (ar[i]);
                sum += nb;
                i++;
            }
            System.out.print("La somme est " + sum + " ");
        } catch (NumberFormatException e) {
            System.out.print("Tous les arguments de ligne de commande doivent être des nombres ");
        } catch (Exception e) {
            System.out.print("Quelque chose marche pas ");
        } finally {
            System.out.println("!!");
        }
    }
}
