package elso;

public class Szem�ly {

	private String nev;
	private int suly;
	private double magassag;
	private double tti;	
		
	public void testTomeg() {
		tti = suly/(magassag*magassag);
	}
		
	public String alkat() {
		if (tti < 18.5 ) {
			return "sov�ny";
		}
		else if (tti > 25 ) {
			return "k�v�r";
		}
		else {
			return "norm�l";
		}
	}
	
	public String getVissza() {
		return  nev + ", " + suly + ", " + magassag + ", tti: " + alkat();
	}
	
	
	
	public void setNev(String nev) {
		this.nev = nev;
	}
	
	public void setSuly(int suly) {
		this.suly = suly;
	}
	
	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}
	
	public String getNev(String nev) {
		return this.nev;
	}
	
	public int getSuly(int suly) {
		return this.suly;
	}
	
	public double getMagassag(double magassag) {
		return this.magassag;
	}
	
		
}
