import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
  @Test
  public void testLAppearsThreeTimesInHelloWorld() {
    // Arrange
    CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello World");
    // Act
    int actualCount = counter.getFrequency('l');
    // Assert
    assertEquals(3,actualCount);

  }
public void testNonOccurringCharacterPercentageIsZero() {
  @Test
  // Arrange
  CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there")
  // Act
  double actualPercentage = counter.getRelativePercentage(c:"1");
  // Assert
  assertEquals(0.0, actualPercentage, 0.0001);
}
    
}