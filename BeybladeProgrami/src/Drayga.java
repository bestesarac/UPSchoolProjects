
public class Drayga extends Beyblade {


	private String kutsalCanavar;
	
	
	public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar=kutsalCanavar;
	}


	@Override
	public void kutsalCanavarCikar() {
		
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya çıkarıyor...");
		System.out.println(getBeybladeci() + " 'nın Saldırısı : Kaplan Pençesi");
	}


	@Override
	public void bilgileriGoster() {
		
		super.bilgileriGoster();
		System.out.println("Kutsal canavar ismi: "+ kutsalCanavar);
		
	}
	
	
	
}
