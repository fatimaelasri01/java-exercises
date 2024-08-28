package ismailSolution.calc;


public class calc {
    // add fumnction
    public  static int add(int a , int b) {
        return a+b;
    }
    public static  double add(double a , double b) {
        return a+b;
    }
    public static  float add (float a , float b)
    {
        return a+b;
    }
    // sous
    public static  int sous(int a , int b) {
        return a-b;
    }
    public static  double sous(double a , double b) {
        return a-b;
    }
    public static  float sous(float a , float b)
    {
        return a-b;
    }
    // multiplacation

    public static  int mul(int a , int b) {
        return a*b;
    }
    public static  double mul(double a , double b) {
        return a*b;
    }
    public static  float mul(float a , float b)
    {
        return a*b;
    }

    // div 
    public static  int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
    
    public static  double div(double a , double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
    public static  float  div(float a , float b)
    {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}