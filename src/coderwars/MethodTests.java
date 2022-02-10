package coderwars;

import static junit.framework.TestCase.assertEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * This class test methods in codewars.
 *
 * @author tamercankacak
 */
public class MethodTests {
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
