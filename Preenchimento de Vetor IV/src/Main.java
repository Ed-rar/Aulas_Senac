import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int par[] = new int[5];
		int impar[] = new int[5];
		int cont1=0;
		int cont2=0;
		

		for (int i = 0; i < 15; i++) {
			int aux = input.nextInt();
			if (aux % 2 == 0) {
				par[cont1] = aux;
				cont1++;
				if(cont1 == 5) {
					for (int j=0; j<cont1; j++) {
						System.out.print("par["+j+"] = "+par[j]+"\n");
					}
					cont1 = 0;
				}
			}else {
				impar[cont2] = aux;
				cont2++;
				if(cont2 == 5) {
					for (int j=0; j<cont2; j++) {
						System.out.print("impar["+j+"] = "+impar[j]+"\n");
					}
					cont2 = 0;
				}
			}
			

		}
		for (int i = 0; i < cont2; i++) {
			System.out.print("impar[" + i + "] = " + impar[i]+"\n");
        }
        for (int i = 0; i < cont1; i++) {
			System.out.print("par[" + i + "] = " + par[i]+"\n");
        }

	}

}