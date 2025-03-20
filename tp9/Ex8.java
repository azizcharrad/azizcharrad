import java.util.Scanner;


class  StringBuffer00{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
            String mot1, mot2; 
            StringBuffer text;
            int L,P;
            System.out.println("saisir un text");
            text=new StringBuffer(scanner.nextLine());
            System.out.println("Donner un mot 1");
            mot1=scanner.next();
            System.out.println("Donner un mot2");
            mot2=scanner.next();
            if (text.indexOf(mot1) == -1) {
                System.out.println(mot1+" "+"n existe pas dans"+" "+text);

                
                
            } else {
                L=mot1.length();
            while (text.indexOf(mot1) != -1) {
                P = text.indexOf(mot1);
                text.replace(P,P+L,mot2.toString());
            }
        
        System.out.println("le nouveau text est :"+text);

    }

    
    
     

    }
}