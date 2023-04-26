package ödev3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int a=random.nextInt(101);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number between 0-100:");
		int girilen_sayi = scanner.nextInt();
		int tahmin_sayisi = 1;
		
		while (a!=girilen_sayi) {
			
		
		if (a>girilen_sayi) {
			
			System.out.println("Too low,try again.");
			girilen_sayi = scanner.nextInt();
			tahmin_sayisi++;
			
		}
		else if (a<girilen_sayi) {
			
			System.out.println("Too high.try again.");
			girilen_sayi = scanner.nextInt();
			tahmin_sayisi++;

		} 
		

		}
		
		System.out.println("Congrats,guess right.");
		System.out.println("Number of guesses: " + tahmin_sayisi);
	}

}
