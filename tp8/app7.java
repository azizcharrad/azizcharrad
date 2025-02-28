public class app7 {
    public static void main(string[]args)
    String chaine ="";
    char char1,char2;
    for(i=0;i<chaine.length();i++){
    char1=chaine.charAt(i)
    if (Character.isLetter(char1)) {
        if (Character.isLowerCase(char1)) {
            char2= (char) ((char1 - 'a' + 3) % 26 + 'a');
        } else {
            char1 = (char) ((char1 - 'A' + 3) % 26 + 'A');
        }
        chaine += cha2; 
        }   else {
            chaine += char1;
        }
}

    

    
    

