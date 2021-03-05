package elso.copy;
import java.util.Scanner;

public class Futatthato {
	public static void main(String[] args) {
		Személy adat  = new Személy();
		
		Scanner input = new Scanner(System.in); 
	    System.out.println("Kérem a nevet: ");

	    adat.setNev(input.nextLine());
	    System.out.println("Kérem a súlyt: ");
	    adat.setSuly(input.nextInt());
	    System.out.println("Kérem a magasságot: "); //VALAMIÉRT EZT VESSZÕVEL KELL MEGADNI!!!
	    adat.setMagassag(input.nextDouble());
	   
	    input.close();
		
		//adat.setNev("Bob");
		//adat.setSuly(55);
		//adat.setMagassag(1.74);
		
		adat.testTomeg();
		adat.alkat();
		
		System.out.println(adat.getVissza());
		
	}
	
}
