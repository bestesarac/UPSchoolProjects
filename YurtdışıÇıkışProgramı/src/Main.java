import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz.");
		
		String sartlar = "Yurtdışı çıkış şartları:\n"
				+ "1-Herhangi bir siyasi yasağınızın bulunmaması gerekiyor.\n"
				+ "2-15TL harç bedelinizi yatırmış olmanız gerekiyor.\n"
				+ "3-Gideceğiniz ülkeye vizenizin bulunması gerekiyor.";
		String massage = "Yurtdışı çıkış şartlarının hepsini sağlamanız gerekiyor.";
		
		while (true) {
			
			System.out.println(sartlar);
			
			Yolcu yolcu = new Yolcu();
			
			System.out.println("Harç bedeli kontrol ediliyor.");
			
			Thread.sleep(3000);
			
			if (yolcu.yurtdisiHarciKontrol() == false) {
				
				System.out.println(massage);
				continue;
				
			}
			
			System.out.println("Siyasi yasak kontrol ediliyor.");
			Thread.sleep(3000);
			
			if (yolcu.siyasiYasak()==false) {
				
				System.out.println(massage);
				continue;
				
			}
			
			System.out.println("Vize durumu kontrol edilioyor.");
			Thread.sleep(3000);
			
			if (yolcu.vizeDurumuKontrol()==false) {
				
				System.out.println(massage);
				continue;
				
			}
			
			System.out.println("Kontrol tamamlandı.Yurtdışına çıkabilirsiniz.");
			break;
		}
	}

}
