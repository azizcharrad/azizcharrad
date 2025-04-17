import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String ch;
        do {
            System.out.print("donner un entier positif : ");
            ch = scanner.next();
            try {
                n = Integer.parseInt(ch);
            } catch (Exception e) {
                n = 0;
            }
        } while (n <= 0);

        int result = Compter(n); 
        System.out.println("Le nombre de chiffres est : " + result); 
    }

    public static int Compter(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }
}
