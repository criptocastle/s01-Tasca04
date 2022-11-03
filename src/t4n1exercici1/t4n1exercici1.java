package t4n1exercici1;

public class t4n1exercici1 {

	public static void main(String[] args) {
		/*	Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any. 
		Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'.*/

		monthsSize();
		monthsNull();
		monthsIndex(7); 
	
	}
	
	
	public static void monthsSize() {
		System.out.println("The size of the linked list is: " + Month.addMonths().size()); //retorna el tamany
		
		}
	
	public static void monthsNull() {
		if (Month.addMonths().isEmpty() == false) {
			System.out.println("\nThe linked list is not empty."); // la llista no és nul.la
		} else {
			System.out.println("The linked list IS empty.");
		}
		
	}
	public static void monthsIndex(Integer index) {
		System.out.println("In the 8th position there is: " + Month.addMonths().get(index)); //posició 8 conté agost
	}
}


