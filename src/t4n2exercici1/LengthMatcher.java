package t4n2exercici1;


import org.junit.jupiter.api.Test;
import org.hamcrest.*;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.*;
//* to get all matchers within the file such as Equals or Is method at the assertThat()

public class LengthMatcher {

	@Test
	public void testStringLenght() { // comparator
		MatcherAssert.assertThat("MordorPathWay", length(is(13)));
		// import right hamcrest's matchers library
		// testing a String and matching its length with length set up
	}

	public static Matcher<String> length(Matcher<? super Integer> matcher) { // customizing matcher for String length
		return new FeatureMatcher<String, Integer>(matcher, "a String with a result lenght that", "expected lenght") {
			// encapsultating the existing "matcher" within the FeatureMatcher class

			@Override
			// overwriting the method featureValueOf that returns the value to be passed to
			// match method () / matchesSafely ()
			protected Integer featureValueOf(String actual) {
				return actual.length();
			}

		};

	}

}
