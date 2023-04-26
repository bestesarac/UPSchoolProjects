
public abstract class Aday {
	
	private int turkce;
	private int fizik;
	private int matematik;
	private int edebiyat;
	private String isim;
	
	public Aday(int turkce, int fizik, int matematik, int edebiyat,String isim) {
		
		this.turkce = turkce;
		this.fizik = fizik;
		this.matematik = matematik;
		this.edebiyat = edebiyat;
		this.isim = isim;
	}

	public int getTurkce() {
		return turkce;
	}

	public void setTurkce(int turkce) {
		this.turkce = turkce;
	}

	public int getFizik() {
		return fizik;
	}

	public void setFizik(int fizik) {
		this.fizik = fizik;
	}

	public int getMatematik() {
		return matematik;
	}

	public void setMatematik(int matematik) {
		this.matematik = matematik;
	}

	public int getEdebiyat() {
		return edebiyat;
	}

	public void setEdebiyat(int edebiyat) {
		this.edebiyat = edebiyat;
	}
	
	public String getIsım() {
		return isim;
	}
	
	public void setIsım(String isim) {
		this.isim = isim;
	}
	
	abstract int puanHesapla();
	
}
