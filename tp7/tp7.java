
import java.util.Scanner;

public class tp7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
int[][] M;
int nl,nc, i, j, x;
Boolean valid = false;
do { 
    System.out.print("donner les lignes : ");
    nl=sc.nextInt();
}while (nl < 1 || nl > 49);

do {   
    System.out.print("donner les colonnes : ");
    nc=sc.nextInt();
}while (nc < 1 || nc> 49);

M = new int[nl][nc];

for (i = 0; i < M.length; i++) {
    for (j = 0; j < M.length; j++) {
        do {   
            System.out.print("M["+i+","+j+"]=");
            M[i][j]=sc.nextInt();
        }while (M[i][j] % 2 != 0);
    }
}

do {   
    System.out.print("Donner x = ");
    x=sc.nextInt();
}while (x % 2 != 0);

i=0;
j=0;

while (!valid && i < nl && j < nc) { 
    if(M[i][j] == x){
        valid = true;
    }else if (i < nl && j == (nc -1)) {
        j =0;
        i++;
    }else{
        j++;
    }
}

if(valid){
    System.out.println(x + " existe!");
}else{
    System.out.println(x + " n'existe pas!");
}

}}