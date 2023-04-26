import java.util.Scanner;

public class Yolcu implements YurtdisiKurallari {

	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
	
	Scanner Scanner = new Scanner(System.in);
	System.out.println("Yatırdığınız harç bedeli : ");
	this.harc=Scanner.nextInt();
	Scanner.nextLine();
	
	System.out.println("Herhangi bir siyasi yasağınız bulunuyor mu ? ");
	String cevap = Scanner.nextLine();
	
	if (cevap.equals("evet")) {
		
		this.siyasiYasak = true;
		
	}
	
	else {
		
		this.siyasiYasak = false;
		
	}
	
	System.out.println("Vizeniz bulunuyor mu ? ");
	String cevap2= Scanner.nextLine();
	
	if (cevap2.equals("evet")) {
		
		this.vizeDurumu = true;
		
	}
	
	else {
		
		this.vizeDurumu = false;
		
	}
	
	}
	
	@Override
	public boolean yurtdisiHarciKontrol() {
		
		if (this.harc<15) {
			
			System.out.println("Lütfen yurtdışı çıkış harcını tam yatırınız.");
			return false;
			
		}
		
		else {
			
			System.out.println("Yurtdışı harç bedeli tamam.");
			return true;
			
		}
		
	}
	@Override
	public boolean siyasiYasak() {
		
		if (this.siyasiYasak==true) {
			
			System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız.");
			return false;
			
		}
		
		else {
			
			System.out.println("Yurtdışı çıkış yasağınız bulunmamaktadır.");
			return true;
			
		}
	}
	
	@Override
	public boolean vizeDurumuKontrol() {
		
		if (this.vizeDurumu== true) {
			
			System.out.println("Vize işlemleriniz tamam.");
			return true;
			
		}
		else {
		 
			System.out.println("Vizeniz bulunmamaktadır.");
			return false;
			
		}
	}
	

}
