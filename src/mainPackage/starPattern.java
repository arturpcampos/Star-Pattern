package mainPackage;

import java.util.Scanner;

public class starPattern {

	public static void main(String[] args) {
		System.out.println("Digite o número de estrelas:");
		Scanner scanI = new Scanner(System.in);
		int nEstrelas = scanI.nextInt();
		
		for(int i = 1; i <= nEstrelas; i++) {	
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = nEstrelas - 1; i > 0; i--) {	
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanI.close();
	}

}
