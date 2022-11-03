package t4n1exercici2;

public class GetDni {
	// Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre
	// el número com a paràmetre.

	public static void main(String[] args) {

		Integer[] dnis = { 39404025, 40392049, 68392023, 58690339, 49596049, 69890291, 39408603, 34853543, 79895969,
				29940221 };

		for (Integer dni : dnis) {
			System.out.println(dni + " lletra " + getDniChar(dni));
		}
	}

	//class method
	public static char getDniChar(int inputNumber) {
		char[] dniChars = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		//char foundChar;
		int foundIndex = inputNumber % 23;

		return dniChars[foundIndex]; //returns a char value
	}

}