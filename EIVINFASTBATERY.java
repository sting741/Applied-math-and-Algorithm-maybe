import java.util.Scanner;

public class EIVINFASTBATERY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double X = sc.nextDouble();
        long months = sc.nextLong();
        double rate = sc.nextDouble()/100;
        
        double result = ((N*Math.pow(1+rate, months)-X)*rate)/(Math.pow(1+rate, months)-1);

        System.out.println(Math.round(result));
    }

}