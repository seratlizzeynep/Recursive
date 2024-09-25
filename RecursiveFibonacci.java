package faktoriyelbulma;

import java.util.Scanner;

public class RecursiveFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Lutfen bir sayi giriniz:");
		Scanner scanner = new Scanner(System.in);
		
		int sayi = scanner.nextInt() ;
		
		System.out.println("Girilen sayinin fibonacci degeri:" + fibonacci(sayi));
		
	}

	//  {0,1, 1, 2, 3, 5, 8, 13...}
	public static int fibonacci( int sayi) {
		if (sayi<=1) {
			
	return sayi;
	
		}else{
		return fibonacci(sayi-1)+ fibonacci(sayi-2);
		
	}
}
}