import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie das gewünschte Rechenzeichen ein: (+, -, *, /)");
        String getRechenzeichen = scanner.nextLine();
        if (getRechenzeichen.equals("+")) {
            System.out.println("Geben sie die erste Zahl an:\n");
            double addieren_erste_zahl = scanner.nextDouble();
            System.out.println("Geben sie die zweite Zahl an:\n");
            double addieren_zweite_zahl = scanner.nextDouble();
            System.out.println(addieren(addieren_erste_zahl, addieren_zweite_zahl));
        }
        else if (getRechenzeichen.equals("-")){
            System.out.println("Geben sie die erste Zahl an:\n");
            double subtrahieren_erste_zahl = scanner.nextDouble();
            System.out.println("Geben sie die zweite Zahl an:\n");
            double subtrahieren_zweite_zahl = scanner.nextDouble();
            System.out.println(subtrahieren(subtrahieren_erste_zahl, subtrahieren_zweite_zahl));

        }
        else if (getRechenzeichen.equals("*")){
            System.out.println("Geben sie die erste Zahl an:\n");
            double multiplizieren_erste_zahl = scanner.nextDouble();
            System.out.println("Geben sie die zweite Zahl an:\n");
            double multiplizieren_zweite_zahl = scanner.nextDouble();
            System.out.println(multiplizieren(multiplizieren_erste_zahl, multiplizieren_zweite_zahl));
        }
        else if (getRechenzeichen.equals("/")) {
            System.out.println("Geben sie die erste Zahl an:\n");
            double dividieren_erste_zahl = scanner.nextDouble();
            System.out.println("Geben sie die zweite Zahl an:\n");
            double dividieren_zweite_zahl = scanner.nextDouble();
            System.out.println(dividieren(dividieren_erste_zahl, dividieren_zweite_zahl));
        }
        else {
            System.out.println("Es wurde keine gültige Recheneinheit angegeben!");
        }

    }
    public static double addieren(double a, double b) {
        return a + b;
    }
    public static double subtrahieren(double a, double b) {
        return a - b;
    }
    public static double multiplizieren(double a, double b) {
        return a * b;
    }
    public static double dividieren(double a, double b) {
        return  a / b;
    }
}