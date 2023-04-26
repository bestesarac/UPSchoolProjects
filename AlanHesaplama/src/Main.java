import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			
			System.out.println("Hangi şekilin alanını hesaplamak istiyorsunuz:\n" + "Çıkmak için q'ya basınız.");
			String sekil= scanner.nextLine();
			Sekil sekil_turu = null;
			
			if (sekil.equals("q")) {
				
				System.out.println("Programdan çıkılıyor.");
				break;
				
			}
			else if (sekil.equals("kare")) {
			
			System.out.println("Karenin kenar uzunluğunu giriniz:");
			int kenar = scanner.nextInt();
			scanner.nextLine();
			
			sekil_turu = new Kare("Kare 1", kenar);
			sekil_turu.alanHesapla();
			
		}
		
		else if (sekil.equals("üçgen")) {
			
			System.out.println("Üçgenin kenar uzunluklarını giriniz:");
			
			System.out.println("Birinci kenar:");
			int a = scanner.nextInt();
			System.out.println("İkinci kenar:");
			int b = scanner.nextInt();
			System.out.println("Üçüncü kenar:");
			int c = scanner.nextInt();
			
			
			scanner.nextLine();
			
			sekil_turu = new Ucgen("Üçgen 1", a,b,c);
			sekil_turu.alanHesapla();
			
		}
		else if (sekil.equals("daire")) {
			
				System.out.println("Dairenin yarıçapını giriniz:");
			
			System.out.println("Yarıçap:");
			int yaricap = scanner.nextInt();
		
			
			scanner.nextLine();
			
			sekil_turu = new Daire("Daire 1", yaricap);
			sekil_turu.alanHesapla();
			
		}
		else {
			System.out.println("Böyle bir şekil bulunamadı.");
		}

		}
	}

}
