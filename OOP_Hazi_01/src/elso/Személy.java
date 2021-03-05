package elso;

public class Személy {

	private String nev;
	private int suly;
	private double magassag;
	private double tti;	
		
	public void testTomeg() {
		tti = suly/(magassag*magassag);
	}
		
	public String alkat() {
		if (tti < 18.5 ) {
			return "sovány";
		}
		else if (tti > 25 ) {
			return "kövér";
		}
		else {
			return "normál";
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
