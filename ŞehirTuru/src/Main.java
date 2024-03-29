import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void islemleri_bastir() {
		
		System.out.println("0 - İşlemleri Görüntüle");
		System.out.println("1 - Bir sonraki şehre git");
		System.out.println("2 - Bir önceki şehre git");
		System.out.println("3 - Uygulamadan çık");

		
	}

	public static void sehirleri_turla(LinkedList<String> sehirler) {
		
		ListIterator<String> itarator = sehirler.listIterator();
		
		int islem;
		
		islemleri_bastir();
		
		Scanner scanner = new Scanner(System.in);
		
		if (!itarator.hasNext()) {
			
			System.out.println("Herhangi bir şehir bulunmuyor.");
			
		}
		
		boolean cikis = false;
		boolean ileri = true;
		
		while (!cikis) {
			
			System.out.println("Bir işlem seçiniz:");
			
			islem = scanner.nextInt();
			
			switch (islem) {
			
			case 0:
				
				islemleri_bastir();
				break;
				
			case 1:
				if (!ileri) {
					
					if (itarator.hasNext()) {
						
						itarator.next();
						
					}
					
					ileri = true;
				
				}
				if (itarator.hasNext()) {
					
					System.out.println("Şehre gidiliyor." + itarator.next());
					
				}
				
				else {
					
					System.out.println("Gidilecek şehir kalmadı.");
					
					ileri = true;
				}
				
				break;
				
			case 2:
				
				if (ileri) {
					
					if (itarator.hasPrevious()) {
						
						itarator.previous();
					}
					
					ileri = false;
					
				}
				
				if (itarator.hasPrevious()) {
					
					System.out.println("Şehre gidiliyor." + itarator.previous());
					
				}
				
				else {
					System.out.println("Şehir turu başladı.");
				}
				
				break;
				
			case 3:
				
				cikis = true;
				System.out.println("Uygulamadan çıkılıyor.");
				break;
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		LinkedList<String> sehirler = new LinkedList<String>();
		
		sehirler.add("Ankara");
		sehirler.add("Eskişehir");
		sehirler.add("Afyon");
		
		sehirleri_turla(sehirler);

	}

}
