package t4n1exercici3;

import org.junit.Test;

public class MyExceptionArrayTest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void myArrayTest(){
		MyExceptionArray.myArrayPosition(10); 
		// if index out of bounds, will throw the exception previously set in the class
		
		
		/*
		try {
			MyExceptionArray.myArrayPosition(1);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()); 
		}
		*/

	}

}
