package fatimaSolutions.addArgs;


public class Add {
    public static void main(String[] args) {

        // Option 1 : sum the args if all the args are numbers
        Option1.sumNum(args);

        System.out.println();
        System.out.println("______________________________________________________________________");
        System.out.println();

        // Option 2 : sum the args and skip the args that are not numbers
        Option2.sumNum2(args);
    }
}