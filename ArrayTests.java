import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {3, 5, 2, 4, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1, 4, 2, 5, 3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {2, 20, 4, 1, 5};
    assertArrayEquals(new int[]{5, 1, 4, 20, 2}, ArrayExamples.reversed(input1));
  }
}
