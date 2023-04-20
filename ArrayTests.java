import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {3,2,1}, input2);
 
    int[] input3 = {9,8,7,6};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[] {6,7,8,9}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    //int[] input2 = {1, 2, 3};
    //assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input2));

    int[] input3 = {10, 11, 12, 13};
    assertArrayEquals(new int[]{13,12,11,10}, ArrayExamples.reversed(input3));
  }

  @Test
  public void testAvgWithoutLowest(){
    double[] arr = {80.0, 40.0};
    assertEquals(80.0, ArrayExamples.averageWithoutLowest(arr), 0.0);

    double[] arr2 = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(arr2), 0.0);

    double[] arr3 = {5.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(arr3), 0.0);

    double[] arr4 = {10.0, 30.0, 20.0, 70.0, 5.0};
    assertEquals(32.5, ArrayExamples.averageWithoutLowest(arr4), 0.0);

    double[] arr5 = {10.0, 20.0, 30.0, 10.0, 10.0};
    assertEquals(25.0, ArrayExamples.averageWithoutLowest(arr5), 0.0);
  }
}
