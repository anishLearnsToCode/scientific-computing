import java.util.Scanner;

public class test {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double x1, x2;
        int error;
        x1 = in.nextDouble();
        x2 = in.nextDouble();
        error = in.nextInt();

        System.out.println(Math.floor(x1*Math.pow(10, error)) - Math.floor(x2*Math.pow(10, error)) );
        System.out.println(Math.floor(x1*Math.pow(10, error)));
        System.out.println(Math.floor(x2*Math.pow(10, error)));
    }
}
