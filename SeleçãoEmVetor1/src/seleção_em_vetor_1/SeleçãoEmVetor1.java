package seleção_em_vetor_1;
import java.util.Random; 

public class SeleçãoEmVetor1 {

  
    public static void main(String[] args) {
        
        Random rnd = new Random();
        float A[] = new float [100];
        
        for (int i = 0; i<A.length; i++){
            A[i] = rnd.nextFloat()*100;
            /*
            usa o objeto random no metodo acima para gerar numeros reais entre 0 e 1 e multiplica por 100 para ter
            o valor real entre 0 e 100
            */
            if(A[i]<=10){
                System.out.printf("A[%d]=%.1f\n", i, A[i]);
            }
        }
        
    
 
    }
    
}
