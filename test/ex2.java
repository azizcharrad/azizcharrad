import java.util.Scanner;

public class ex2 {

    public static double addition(double x, double y) {
        return x + y;
    }

    public static double soustraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        if (y == 0) {
            System.out.println("Erreur division par zéro ");
            return 0;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        char op;

        System.out.print("Entrez le premier nombre : ");
        a = scanner.nextDouble();

        System.out.print("Entrez un opérateur (+, -, *, /) : ");
        op = scanner.next().charAt(0);

        System.out.print("Entrez le deuxième nombre : ");
        b = scanner.nextDouble();

        double resultat = 0;
        boolean valide = true;

        switch (op) {
            case '+':
                resultat = addition(a, b);
                break;
            case '-':
                resultat = soustraction(a, b);
                break;
            case '*':
                resultat = multiplication(a, b);
                break;
            case '/':
                resultat = division(a, b);
                break;
            default:
                System.out.println("Operateur non valide");
                valide = false;
        }

        if (valide) {
            System.out.println("resultat : " + resultat);
        }
    }
}
