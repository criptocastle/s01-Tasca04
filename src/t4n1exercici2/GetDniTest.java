package t4n1exercici2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)//this calls the method tagged with @Parameters
public class GetDniTest {
	
	private int inputNumber;
	private char expResult; 
	
	/* create CONSTRUCTOR to store the test data 
	 * EACH PARAMETER should be placed as an ARGUMENT here. 
	 * Everytime runner triggers, it will pass the arguments from PARAMETERS we defined in dniNumbers Method */
	
	
	  public GetDniTest(char expResult, int inputNumber) { 
		  this.expResult = expResult; 
		  this.inputNumber = inputNumber; }
	 		
	@Parameters 
	//within this collection of the object class we introduce as many parameters as constructor method has to be tested each time
	public static Iterable<Object[]> dniNumbers(){
		//add to array Short version: {char expResult, int inputNumber} 		
		return Arrays.asList(new Object[][]{
			{'B', 39404025}, {'R', 40392049}, {'M', 68392023}, {'C', 58690339}, {'E', 49596049}, 
			{'F', 69890291}, {'N', 39408603}, {'X', 34853543}, {'H', 79895969}, {'V', 29940221}});  
			
	}
	
	/*  add to array Extended version: {char expResult, int inputNumber} 
	 
		List<Object[]> dni = new ArrayList<>(); 
		dni.add(new Object[] {'B', 39404025}); 
		dni.add(new Object[] {'R', 40392049});
		dni.add(new Object[] {'M', 68392023});
		dni.add(new Object[] {'C', 58690339});
		dni.add(new Object[] {'E', 49596049});
		dni.add(new Object[] {'F', 69890291});
		dni.add(new Object[] {'N', 39408603});
		dni.add(new Object[] {'X', 34853543});
		dni.add(new Object[] {'H', 79895969});
		dni.add(new Object[] {'V', 29940221});

		return dni;
	 */
	
	@Test
	public void getCharTest() {
	//you send each time the running inputNumber to be tested with the method of the class GetDni
		System.out.println("dni/ " + inputNumber + GetDni.getDniChar(inputNumber) + " expected char/ " + expResult); 
		assertEquals(expResult, GetDni.getDniChar(inputNumber)); 
		//test will run 10 times since we have 10 parameters defined  
	}

}
