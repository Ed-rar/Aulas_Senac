package troca_de_posicoes;
import java.util.Scanner;

public class Troca_De_Posicoes {


    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int N[] = new int[20];
    int X[] = new int[20];
    
    for(int i = 0; i<N.length; i++){
        N[i]=input.nextInt();
    }
    
    for(int i = 0; i<N.length; i++){
        X[i]=N[N.length-1-i];
    }
    
    for(int i = 0; i<N.length; i++){
        N[i]=X[i];
        System.out.printf("N[%d] = %d\n", i, N[i]);
    }
   
    }
    
}
