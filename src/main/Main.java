package main;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int j = 0;

		int[][] lista = new int[3][3];
		
		for(i = 0; i < lista.length; i++) {		
			for(j = 0; j < lista.length; j++) {
				System.out.println("Digite o valor para a posição [" + i + "," + j + "]:");
				lista[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.println("Matriz Original:");
		System.out.println(Arrays.toString(lista[0]));
		System.out.println(Arrays.toString(lista[1]));
		System.out.println(Arrays.toString(lista[2]));
		
		System.out.println();
		
		System.out.println("Diagonal Principal: ");
		System.out.println(lista[0][0] + "," + lista[1][1] + "," + lista[2][2]);

		
		sc.close();
	}

}
