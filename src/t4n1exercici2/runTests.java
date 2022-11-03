package t4n1exercici2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class runTests {
	  Result result = JUnitCore.runClasses(GetDniTest.class);{
		  
      for (Failure fail : result.getFailures()) {
          System.out.println(fail.toString());
      }
      if (result.wasSuccessful()) {
          System.out.println("All tests finished successfully...");
      }
  }

}
