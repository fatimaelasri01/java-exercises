package fatimaSolutions.addArgs;

public class Option2 {
    public static void sumNum2(String[] ar) {
        float sum = 0, nb = 0;
        int i = 0;
        while (i < ar.length) {
            try {
                nb = Float.parseFloat(ar[i]);
            } catch (NumberFormatException e) {
                System.out.println("l' argument " + (i + 1) + " = " + ar[i] + " n'est pas un nombre");
                nb = 0;
            } catch (Exception e) {
                System.out.println("Quelque chose marche pas ");
            }
            sum += nb;
            i++;
        }
        System.out.println("La somme est " + sum); 
    }
}
