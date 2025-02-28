import java.util.Scanner;
public class app5 {    
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    String mot1,mot2;
    String texte;
    System.out.println("donner chaine de charactere");
    texte = sc.nextLine();
    System.out.println("donner mot1 :");
    mot1 = sc.nextLine();
    System.out.println("donner mot2 :");
    mot2 = sc.nextLine();
    if(texte.indexOf(mot1)==-1){
        System.out.println(mot1+" n'existe pas");
    }
    else{
        texte=texte.replace(mot1,mot2);
        System.out.println("Le nouveau texte est : " + texte);
    }

}
}
