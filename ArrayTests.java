import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  //
  /*
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  */

  //
  /*
  @Test
  public void testReverseInPlace2() {
    int[] input1 = { 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 3 }, input1);
  }
  */

  //
  
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  

  //
  /*
  @Test
  public void testReversed2() {
    int[] input1 = { 3 };
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reversed(input1));
  }
  */

  /*
  @Test 
	public void testReversed3() {
    int[] input1 = { 3, 4, 5 };
    int[] output = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{ 5, 4, 3 }, output);
	}
  */

  // 
  /*
  @Test
  public void testAverage() {
    double[] input1 = { 3, 3, 4 };
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
  */
}
