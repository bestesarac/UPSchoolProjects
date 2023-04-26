import java.util.Scanner;

import javax.naming.SizeLimitExceededException;
import javax.sound.midi.VoiceStatus;

public class Main {

	private static Sarkicilar sarkicilar = new Sarkicilar(); 
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void islemleri_bastir() {
		
		System.out.println("\t 0-İşlemleri Görüntüle");
		System.out.println("\t 1-Şarkıcıları Görüntüle");
		System.out.println("\t 2-Şarkıcı Ekle");
		System.out.println("\t 3-Şarkıcı Güncelle");
		System.out.println("\t 4-Şarkıcı Sil");
		System.out.println("\t 5-Şarkıcı Ara");
		System.out.println("\t 6-Uygulamadan Çık");
		
	}
	
	public static void sarkici_goruntule() {
		
		sarkicilar.sarkicilari_bastir();
		
	}
	
	public static void sarkici_ekle() {
		
		System.out.println("Eklemek istediğiniz şarkıcının adını giriniz.");
		
		String isim = scanner.nextLine();
		
		sarkicilar.sarkici_ekle(isim);
	}
	
	public static void sarkici_güncelle() {
		
		System.out.println("Güncellemek istediğiniz pozisyonu giriniz.");
		
		int pozisyon = scanner.nextInt();
		
		scanner.nextLine();
		
		String yeni_isim = scanner.nextLine();
		
		sarkicilar.sarkici_guncelle(yeni_isim, pozisyon-1);
		
	}
	
	public static void sarkici_sil() {
		
		System.out.println("Silmek istediğiniz şarkıcının posizyonunu giriniz.");
		
		int pozisyon = scanner.nextInt();
		
		sarkicilar.sarkici_sil(pozisyon-1);
		
	}
	
	public static void sarkici_ara( ) {
		
		System.out.println("Aramak istediğiniz şarkıcıyı giriniz.");
		
		String isim= scanner.nextLine();
		
		sarkicilar.sarkici_ara(isim);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Şarkıcılar uygulamasına hoşgeldiniz.");
		
		islemleri_bastir();
		
		boolean cikis = false;
		
		int islem;
		
		while (!cikis) {
			
			System.out.println("Bir işlem seçiniz.");
			
			islem = scanner.nextInt();
			
			scanner.nextLine();
			
			switch(islem) {
			
			case 0:
				islemleri_bastir();
				break;
			case 1:
				sarkici_goruntule();
				break;
			case 2:
				sarkici_ekle();
				break;
			case 3:
				sarkici_güncelle();
				break;
			case 4:
				sarkici_sil();
				break;
			case 5:
				sarkici_ara();
				break;
			case 6:
				cikis= true;
				System.out.println("Uygulamadan çıkılıyor.");
				break;
				
				
			}
			
		}

	}

}
