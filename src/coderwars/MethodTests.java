package coderwars;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * This class test methods in codewars.
 *
 * @author tamercankacak
 */
public class MethodTests {

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
