package elso.copy;
import java.util.Scanner;

public class Futatthato {
	public static void main(String[] args) {
		Szem�ly adat  = new Szem�ly();
		
		Scanner input = new Scanner(System.in); 
	    System.out.println("K�rem a nevet: ");

	    adat.setNev(input.nextLine());
	    System.out.println("K�rem a s�lyt: ");
	    adat.setSuly(input.nextInt());
	    System.out.println("K�rem a magass�got: "); //VALAMI�RT EZT VESSZ�VEL KELL MEGADNI!!!
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
