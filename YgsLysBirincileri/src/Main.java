import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("YGS-LYS Birinci Bulma Programı");
		Scanner scanner = new Scanner(System.in);
		
		String islemler = "İşlemler\n"
				+"1.Eşit Ağırlık Öğrencileri birincisi\n"
				+"2.Sayısal Öğrencileri birincisi\n"
				+"Çıkış için q'ya basınız.";
		
		System.out.println(islemler);
		
		while (true) {
			
			System.out.println("Birinci öğrenci ismi: ");
			String isim1 = scanner.nextLine();
			System.out.println("Lütfen netlerinizi giriniz.(Türkçe Fizik Matematik Edebiyat) : ");
			int turkce1 = scanner.nextInt();
			int fizik1 = scanner.nextInt();
			int matematik1 = scanner.nextInt();
			int edebiyat1 = scanner.nextInt();
			scanner.nextLine();

			
			System.out.println("İkinci öğrenci ismi: ");
			String isim2 = scanner.nextLine();
			System.out.println("Lütfen netlerinizi giriniz.(Türkçe Fizik Matematik Edebiyat) : ");
			int turkce2 = scanner.nextInt();
			int fizik2 = scanner.nextInt();
			int matematik2 = scanner.nextInt();
			int edebiyat2 = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Üçüncü öğrenci ismi: ");
			String isim3 = scanner.nextLine();
			System.out.println("Lütfen netlerinizi giriniz.(Türkçe Fizik Matematik Edebiyat) : ");
			int turkce3 = scanner.nextInt();
			int fizik3 = scanner.nextInt();
			int matematik3 = scanner.nextInt();
			int edebiyat3 = scanner.nextInt();
			scanner.nextLine();

			
			System.out.println("İşlemi giriniz.");
			String islem = scanner.nextLine();
			
			if (islem.equals("q")) {
				
				System.out.println("Programdan çıkılıyor.");
				break;
			
			}
			
			else if (islem.equals("1")) {
				
				EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, fizik1, matematik1, edebiyat1, isim1);
				EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, fizik2, matematik2, edebiyat2, isim2);
				EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, fizik3, matematik3, edebiyat3, isim3);
				
				EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
				
				System.out.println("Birinci Eşit Ağırlık Öğrencisi:" + birinci.getIsım());
				System.out.println("Öğrenci Puanı:" + birinci.puanHesapla());
			}
			
			else if (islem.equals("2")) {
			
				Sayisal ogrenci1 = new Sayisal(turkce1, fizik1, matematik1, edebiyat1, isim1);
				Sayisal ogrenci2 = new Sayisal(turkce2, fizik2, matematik2, edebiyat2, isim2);
				Sayisal ogrenci3 = new Sayisal(turkce3, fizik3, matematik3, edebiyat3, isim3);
				
				Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
				
				System.out.println("Birinci Sayısal Öğrencisi:" + birinci.getIsım());
				System.out.println("Öğrenci Puanı:" + birinci.puanHesapla());
			}
			
			else {
			
				System.out.println("Geçersiz işlem.");
			
			}
			
		}
	}
	
	
	public static <E extends Aday> E birinci(E e1,E e2, E e3) {
		
		if (e1.puanHesapla()>e2.puanHesapla()&& e1.puanHesapla()>e3.puanHesapla()) {
			
			return e1;
		}
		
		else if (e2.puanHesapla()>e1.puanHesapla()&& e2.puanHesapla()>e3.puanHesapla()) {
			
			return e2;
		}
		
		else if (e3.puanHesapla()>e2.puanHesapla()&& e3.puanHesapla()>e1.puanHesapla()) {
			
			return e3;
		}
		
		else {
			
			return e1;
		}
	}

}
