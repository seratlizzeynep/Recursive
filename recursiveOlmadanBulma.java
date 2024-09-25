package fibonacci;

import java.util.Scanner;

public class recursiveOlmadanBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fibonacci dizisinin hangi elemanini istersiniz?");
		
	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println("Fibonacci dizisinin " + n + " . elemani:" + fibonacci(n));
		}
	
	public static int fibonacci(int n) {

		int n1 = 0;
		int n2= 1;
		int sonuc = 1;
		
		
		for (int i = 2; i <= n; i++) {
            sonuc = n1 + n2;
            n1 = n2;
            n2 = sonuc;
        }

        return sonuc;
    
}
}