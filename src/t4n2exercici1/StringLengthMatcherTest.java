package t4n2exercici1;


import org.junit.jupiter.api.Test;
import org.hamcrest.*;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.*;
//* to get all matchers within the file such as Equals or Is method at the assertThat()

class StringLengthMatcherTest {

	/*
	 * Defineix un Matcher personalitzat per a Hamcrest que proporcioni el Matcher
	 * de longitud per a un String. Volem usar la classe ->FeatureMatcher. Amb
	 * FeatureMatcher podem ajustar un Matcher existent, decidir quin camp de
	 * l'Objecte prova ha de coincidir i proporcionar un missatge d'error agradable.
	 * El constructor de FeatureMatcher té els següents arguments en aquest ordre: -
	 * El matcher que volem embolicar. - Una descripció de la funció que provem. -
	 * Una descripció del possible mismatch (desajustament). L'únic mètode que hem
	 * de sobreescriure és featureValueOf (T actual), que retorna el valor que es
	 * passarà al mètode match () / matchesSafely (). Utilitza el seu comparador
	 * personalitzat en una prova per a comprovar si la cadena "Mordor" té una
	 * longitud de 8.
	 * 
	 * Ajusta la prova si és necessari.
	 * 
	 */

	public static Matcher<String> length(Matcher<? super Integer> matcher) { //customizing matcher for String length
	//encapsultating the existing "matcher" within the FeatureMatcher class
		return new FeatureMatcher<String, Integer>(matcher, "a String with a result lenght that", "expected lenght") {

			@Override
			// overwriting the method featureValueOf that returns the value to be passed to match method () / matchesSafely ()
			protected Integer featureValueOf(String actual) {
				return actual.length();
			}

		};

	}

	@Test
	public void testStringLenght() { //comparator
	//testing a String and matching its length with length set up
		MatcherAssert.assertThat("MordorPathWay", length(is(8)));
	}

}
