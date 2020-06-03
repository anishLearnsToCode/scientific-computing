import java.util.Scanner;

public class NR_Method {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double x2, x;
        int error = 7;

        for(x=0, x2=0.01 ; ; x2 += 0.01){
            if(Math.signum(function(x)) + Math.signum(function(x2)) == 0){
                break;
            }
        }

        double x0 = x2;

        int a=10;
        while (true){
            if(function(x0) == 0){
                break;
            }

            x = x0 - function(x0) / diff_functiion(x0);
            if(Math.floor(x*Math.pow(10, error)) - Math.floor(x0*Math.pow(10, error)) == 0){
                x0 = x;
                break;
            }
            x0 = x;
        }
        System.out.println("Root : " + x0);
        System.out.println("Function value at root : " + function(x0));
    }

    private static double function(double x){
        return Math.pow(x,3) - 4*x -9;
    }

    private static double diff_functiion(double x){
        return 3*Math.pow(x,2) - 4;
    }
}
