package coderwars;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

/**
 * This class test methods in codewars.
 *
 * @author tamercankacak
 */
public class MethodTests {

  @Test
  public void testOrder() {
    assertEquals(Order.order("Empty input should return empty string"),"");
  }

  @Test
  public void metroTest() {
    ArrayList<int[]> list = new ArrayList<int[]>();
    list.add(new int[] {10, 0});
    list.add(new int[] {3, 5});
    list.add(new int[] {2, 5});
    assertEquals(5, Metro.countPassengers(list));
  }

  @Test
  public void counterTest() {
    Boolean[] array1 = {
      true, true, true, false, true, true, true, true, true, false, true, false, true, false, false,
      true, true, true, true, true, false, false, true, true
    };
    assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
    assertEquals("There are 17 sheeps in total", 0, new Counter().countSheeps(null));
  }

  @Test
  public void sampleTests() {
    assertArrayEquals(
        new double[] {1, 1, 1, 3, 5, 9, 17, 31, 57, 105},
        Xbonacci.tribonacci(new double[] {1, 1, 1}, 10),
        1e-10);
    assertArrayEquals(
        new double[] {0, 0, 1, 1, 2, 4, 7, 13, 24, 44},
        Xbonacci.tribonacci(new double[] {0, 0, 1}, 10),
        1e-10);
    assertArrayEquals(
        new double[] {0, 1, 1, 2, 4, 7, 13, 24, 44, 81},
        Xbonacci.tribonacci(new double[] {0, 1, 1}, 10),
        1e-10);
  }

  @Test
  public void publicTests() {
    assertEquals(true, TriangleTester.isTriangle(1, 2, 2));
    assertEquals(false, TriangleTester.isTriangle(7, 2, 2));
  }

  @Test
  public void printerTest() {
    System.out.println("printerError Fixed Tests");
    String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
    assertEquals("3/56", Printer.printerError(s));
  }

  @Test
  public void testBasic() {
    assertEquals(9, SquareSum.squareSum(new int[] {1, 2, 2}));
    assertEquals(5, SquareSum.squareSum(new int[] {1, 2}));
    assertEquals(50, SquareSum.squareSum(new int[] {5, -3, 4}));
    assertEquals(0, SquareSum.squareSum(new int[] {}));
  }

  @Test
  public void testSomething() {
    assertEquals("8j8mBliB8gimjB8B8jlB", NoSpace.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    assertEquals(
        "88Bifk8hB8BB8BBBB888chl8BhBfd",
        NoSpace.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
    assertEquals("8aaaaaddddr", NoSpace.noSpace("8aaaaa dddd r     "));
    assertEquals("jfBmgklf8hg88lbe8", NoSpace.noSpace("jfBm  gk lf8hg  88lbe8 "));
    assertEquals("8jaam", NoSpace.noSpace("8j aam"));
  }

  @Test
  public void BasicTests() {
    System.out.println("****** Basic Tests ******");
    assertEquals(3, Persist.persistence(39));
    assertEquals(0, Persist.persistence(4));
    assertEquals(2, Persist.persistence(25));
    assertEquals(4, Persist.persistence(999));
  }

  @Test
  public void testfindNextSquare() {
    assertEquals(-1, NumberFun.findNextSquare(114));
    assertEquals(144, NumberFun.findNextSquare(121));
    assertEquals(676, NumberFun.findNextSquare(625));
  }

  @Test
  public void example1() {
    int expected = 11;
    int actual = SmallestIntegerFinder.findSmallestInt(new int[] {78, 56, 232, 12, 11, 43});
    assertEquals(expected, actual);
  }

  @Test
  public void test1() {
    assertEquals(Arge.nbYear(1500, 5, 100, 5000), 15);
    assertEquals(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
    assertEquals(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
  }

  @Test
  public void testGrassHopper() {
    assertEquals(1, GrassHopper.summation(1));
    assertEquals(36, GrassHopper.summation(8));
  }

  @Test
  public void testSimpleDirReduc() {
    assertArrayEquals(
        "\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
        new String[] {"WEST"},
        DirReduction.dirReduc(
            new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    assertArrayEquals(
        "\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
        new String[] {},
        DirReduction.dirReduc(new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}));
  }

  @Test
  public void Test1() {
    assertEquals(-1, Sum.GetSum(0, -1));
    assertEquals(1, Sum.GetSum(0, 1));
  }

  @Test
  public void tests() {
    assertEquals("67", ConvertaNumbertoString.numberToString(67));
    assertEquals("123", ConvertaNumbertoString.numberToString(123));
    assertEquals("999", ConvertaNumbertoString.numberToString(999));
  }

  @Test
  public void testExample() {
    int[] exampleTest1 = {2, 6, 8, -10, 3};
    int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
    int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
    assertEquals(3, FindOutlier.find(exampleTest1));
    assertEquals(206847684, FindOutlier.find(exampleTest2));
    assertEquals(0, FindOutlier.find(exampleTest3));
  }

  @Test
  public void testSolution() {
    assertEquals("############5616", Maskify.maskify("4556364607935616"));
    assertEquals("#######5616", Maskify.maskify("64607935616"));
    assertEquals("1", Maskify.maskify("1"));
    assertEquals("", Maskify.maskify(""));

    // "What was the name of your first pet?"
    assertEquals("##ippy", Maskify.maskify("Skippy"));
    assertEquals(
        "####################################man!",
        Maskify.maskify("Nananananananananananananananana Batman!"));
  }

  @Test
  public void test4a() {
    assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
    assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
    assertEquals("", StringRepeat.repeatStr(5, ""));
    assertEquals("", StringRepeat.repeatStr(0, "kata"));
  }

  @Test
  public void testBoolToWord() {
    assertEquals(YesOrNo.boolToWord(true), "Yes");
    assertEquals(YesOrNo.boolToWord(false), "No");
    assertEquals(YesOrNo.boolToWord(false), "No");
    assertEquals(YesOrNo.boolToWord(false), "No");
    assertEquals(YesOrNo.boolToWord(false), "No");
  }

  @Test
  public void examples() {
    // assertEquals("expected", "actual");
    assertEquals(Arrays.asList(1, 2), ListFiltering.filterList(Arrays.asList(1, 2, "a", "b")));
    assertEquals(
        Arrays.asList(1, 0, 15), ListFiltering.filterList(Arrays.asList(1, "a", "b", 0, 15)));
    assertEquals(
        Arrays.asList(1, 2, 123),
        ListFiltering.filterList(Arrays.asList(1, 2, "aasf", "1", "123", 123)));
  }

  @Test
  public void fixedTests() {
    assertEquals("Ths wbst s fr lsrs LL!", Troll.disemvowel("This website is for losers LOL!"));
    assertEquals(
        "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
        Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
    assertEquals("Wht r y,  cmmnst?", Troll.disemvowel("What are you, a communist?"));
  }

  @Test
  public void testGame() {
    assertEquals(5, BitCounting.countBits(1234));
    assertEquals(1, BitCounting.countBits(4));
    assertEquals(3, BitCounting.countBitsCodeWars(7));
    assertEquals(2, BitCounting.countBits(9));
    assertEquals(2, BitCounting.countBits(10));
  }
}
