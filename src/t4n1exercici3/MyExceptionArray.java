package t4n1exercici3;

public class MyExceptionArray {
	/*
	 * Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
	 * Verifica el seu correcte funcionament amb un test jUnit.
	 */

	 
	public static void main(String[] args) { //check method works
		myArrayPosition(1);
		myArrayPosition(-3); //AIOOB
	}
	

	public static void myArrayPosition(int index) throws ArrayIndexOutOfBoundsException {
		int myArray[] = { 1, 2, 3, 4, 5 };

		if (index >= myArray.length || index < 0) {
			throw new ArrayIndexOutOfBoundsException("Array Index Out of Bounds. Set a right index value.");
		} else {
			System.out.println(myArray[index] + ". Array index value successfully printed");
		}

	}
}
