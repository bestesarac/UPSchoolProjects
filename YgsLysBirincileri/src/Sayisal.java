
public class Sayisal extends Aday {

	public Sayisal(int turkce, int fizik, int matematik, int edebiyat,String isim) {
		super(turkce, fizik, matematik, edebiyat,isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int puanHesapla() {
		return getTurkce() * 5 + getEdebiyat() * 1 + getFizik() * 4 + getMatematik() * 5;
	}

}
