package  faktoriyelbulma;

import java.util.Scanner;

public class faktoriyelBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Lütfen bir sayi giriniz:");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int sonuc = faktoriyel(input);
		System.out.println(input + "!" + "=" + sonuc);
		
	}

	public static int faktoriyel(int input) {
		
		if (input==0) {
			return 1;
		} else {

			return input * faktoriyel(input-1);
		}
		
	}
}
