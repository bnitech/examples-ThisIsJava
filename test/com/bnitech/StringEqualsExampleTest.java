package com.bnitech;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StringEqualsExampleTest {

  @Test
  void 결과_테스트() {
    // region Given
    String strVar1 = "임동빈";
    String strVar2 = "임동빈";
    String strVar3 = new String("임동빈");

    boolean expectedResult1 = true;
    boolean expectedResult2 = false;
    boolean expectedResult3 = true;
    boolean expectedResult4 = true;
    // endregion

    // region When
    boolean actualResult1 = strVar1 == strVar2;
    boolean actualResult2 = strVar1 == strVar3;
    boolean actualResult3 = strVar1.equals(strVar2);
    boolean actualResult4 = strVar1.equals(strVar3);
    // endregion

    // region Then
    assertEquals(expectedResult1, actualResult1);
    assertEquals(expectedResult2, actualResult2);
    assertEquals(expectedResult3, actualResult3);
    assertEquals(expectedResult4, actualResult4);
    // endregion
  }
}