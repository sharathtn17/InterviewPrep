package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class TestclassSample {
 
  @Test(retryAnalyzer = MyRetry.class)
  public void test2() {
    Assert.fail();
  }
}
