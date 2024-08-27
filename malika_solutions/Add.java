package malika_solutions;

public class Add {
    public static void main(String[] args)
    {
        double sum = 0;
        int i = 0;
        int j = 1;
        if (args.length == 0) {
            System.out.println("Aucun argment n'est passe!!");  
        }
        else
        {
            //Option A:
            /*for (String arg : args) {
                try {
                    sum += Float.parseFloat(arg);   
                } catch (NumberFormatException e) {
                    //System.out.println("Erreur : Tous les arguments de la ligne de commande doivent être des nombres :(");
                    System.out.println("Erreur #"+j+" : l'argument #"+i+" = '"+arg+"' n'est pas un nombre!!");
                    j++;
                } 
                i++;
            }
            System.out.println("La somme des arguments valides est :"+sum);
            */
            //Option B:
            for (String arg : args) {
                try {
                    sum += Float.parseFloat(arg);   
                } catch (NumberFormatException e) {
                    j++;
                }
            }
            if (j == 1)
                System.out.println("La somme de tout les arguments est :"+sum);
            else
                System.out.println("Erreur : Tous les arguments de la ligne de commande doivent être des nombres :(");

        }
    }
}
