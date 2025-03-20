import java.util.Scanner;

class Rech_Pep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un text");
        String text = scanner.nextLine();
        System.out.println("Donner un mot 1");
        String mot1 = scanner.next();
        System.out.println("Donner un mot 2");
        String mot2 = scanner.next();

        if (text.indexOf(mot1)==-1) {
            System.out.println(mot1 + " n'existe pas dans " + text);
        } else {
            text = text.replace(mot1, mot2);
        }

        System.out.println("le nouveau text est : " + text);
    }
}