import java.util.Scanner;

public class BedenKitleIndeksi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("kilonuzu giriniz:");
		int kilo = scanner.nextInt();
		System.out.println("boyunuzu giriniz(1.75):");
		double boy = scanner.nextDouble();
		double bki = kilo / (boy*boy);
		System.out.println("beden kitle indeksiniz:"+ bki);
	}

}
