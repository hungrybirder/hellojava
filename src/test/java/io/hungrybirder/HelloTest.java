package io.hungrybirder;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

  @Test
  public void testCool() {
    Assert.assertEquals("cool", Hello.cool());
  }
}
