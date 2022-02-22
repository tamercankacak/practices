package coderwars;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.junit.Test;

/**
 * This class test methods in codewars.
 *
 * @author tamercankacak
 */
public class MethodTests {

  @Test
  public void testMaps() {
    assertArrayEquals(new int[] {2, 4, 6}, Maps.masp(new int[] {1, 2, 3}));
    assertArrayEquals(new int[] {8, 2, 2, 2, 8}, Maps.masp(new int[] {4, 1, 1, 1, 4}));
    assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, Maps.masp(new int[] {1, 1, 1, 1, 1, 1}));
  }

  @Test
  public void testNeedleInHaystack() {
    Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
    Object[] haystack2 = {
      "283497238987234",
      "a dog",
      "a cat",
      "some random junk",
      "a piece of hay",
      "needle",
      "something somebody lost a while ago"
    };
    Object[] haystack3 = {
      1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234,
      324, 324, "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54
    };
    assertEquals("found the needle at position 3", NeedleInHaystack.findNeedle(haystack1));
    assertEquals("found the needle at position 5", NeedleInHaystack.findNeedleCodeWars(haystack2));
    assertEquals("found the needle at position 30", NeedleInHaystack.findNeedle(haystack3));
  }

  @Test
  public void testStringSplit() {
    String s = "abcdef";
    String s1 = "HelloWorld";
    assertEquals(
        "Should handle even string", "[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)));
    assertEquals(
        "Should handle even string",
        "[He, ll, oW, or, ld]",
        Arrays.toString(StringSplit.solution(s1)));

    s = "abcde";
    s1 = "LovePizza";
    assertEquals(
        "Should handle odd string", "[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)));
    assertEquals(
        "Should handle odd string",
        "[Lo, ve, Pi, zz, a_]",
        Arrays.toString(StringSplit.solution(s1)));
  }

  @Test
  public void testMinMax() {
    assertArrayEquals(new int[] {1, 5}, MinMax.minMax(new int[] {1, 2, 3, 4, 5}));
    assertArrayEquals(new int[] {5, 2334454}, MinMax.minMax(new int[] {2334454, 5}));
    assertArrayEquals(new int[] {1, 1}, MinMax.minMax(new int[] {1}));
  }

  @Test
  public void testConvertNumberToReversedArrayOfDigits() {
    assertArrayEquals(
        new int[] {1, 3, 2, 5, 3}, ConvertNumberToReversedArrayOfDigits.digitize(35231));
    assertArrayEquals(new int[] {0}, ConvertNumberToReversedArrayOfDigits.digitize(0));
  }

  @Test
  public void testSortTheOdd() {
    assertArrayEquals(
        new int[] {1, 3, 2, 8, 5, 4}, SortTheOdd.sortArray(new int[] {5, 3, 2, 8, 1, 4}));
    assertArrayEquals(new int[] {1, 3, 5, 8, 0}, SortTheOdd.sortArray(new int[] {5, 3, 1, 8, 0}));
    assertArrayEquals(new int[] {}, SortTheOdd.sortArray(new int[] {}));
  }

  @Test
  public void testLineNumbering() {
    assertEquals(Arrays.asList(), LineNumbering.number(Arrays.asList()));
    assertEquals(
        Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
    assertEquals(
        Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "),
        LineNumbering.number(Arrays.asList("", "", "", "", "")));
  }

  @Test
  public void testAbbreviateTwoWords() {
    assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
    assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
    assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
    assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
    assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
  }

  @Test
  public void sampleTestCases() {
    double precision = 0.0000000000001;
    assertEquals(1.0, FindTheUniqueNumber.findUniq(new double[] {0, 1, 0}), precision);
    assertEquals(2.0, FindTheUniqueNumber.findUniq(new double[] {1, 1, 1, 2, 1, 1}), precision);
  }

  @Test
  public void testReverseWords() {
    assertEquals(
        "ehT kciuq nworb xof spmuj revo eht yzal .god",
        ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
    assertEquals("elppa", ReverseWords.reverseWords("apple"));
    assertEquals("a b c d", ReverseWords.reverseWords("a b c d"));
    assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords("double  spaced  words"));
    assertEquals("   ", ReverseWords.reverseWords("   "));
  }

  @Test
  public void testBasics() {
    assertEquals(11, BasicOperations.basicMath("+", 4, 7));
    assertEquals((-3), BasicOperations.basicMath("-", 15, 18));
    assertEquals((25), BasicOperations.basicMath("*", 5, 5));
    assertEquals((7), BasicOperations.basicMath("/", 49, 7));
  }

  @Test
  public void testFindMissingLetter() {
    assertEquals('e', FindMissinLetter.findMissingLetter(new char[] {'a', 'b', 'c', 'd', 'f'}));
    assertEquals('P', FindMissinLetter.findMissingLetter(new char[] {'O', 'Q', 'R', 'S'}));
  }

  @Test
  public void testNthSeries() {
    assertEquals("1.57", NthSeries.seriesSum(5));
    assertEquals("1.77", NthSeries.seriesSum(9));
    assertEquals("1.94", NthSeries.seriesSum(15));
  }

  @Test
  public void keepHydratedTest() {

    assertEquals(1, KeepHydrated.Liters(2));
    assertEquals(0, KeepHydrated.Liters(0.97));
    assertEquals(7, KeepHydrated.Liters(14.64));
    assertEquals(800, KeepHydrated.Liters(1600.20));
    assertEquals(40, KeepHydrated.Liters(80));
  }

  @Test
  public void testFindEvenIndex() {
    assertEquals(3, FindEvenIndex.findEvenIndex(new int[] {1, 2, 3, 4, 3, 2, 1}));
    assertEquals(1, FindEvenIndex.findEvenIndex(new int[] {1, 100, 50, -51, 1, 1}));
    assertEquals(-1, FindEvenIndex.findEvenIndex(new int[] {1, 2, 3, 4, 5, 6}));
    assertEquals(3, FindEvenIndex.findEvenIndex(new int[] {20, 10, 30, 10, 10, 15, 35}));
    assertEquals(-1, FindEvenIndex.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
    assertEquals(
        1, FindEvenIndex.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
    assertEquals(
        6, FindEvenIndex.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
  }

  @Test
  public void testStringEndsWith() {
    assertEquals(true, StringEndsWith.solution("abc", "bc"));
    assertEquals(false, StringEndsWith.solution("abc", "d"));
  }

  @Test
  public void FixedTests() {
    assertEquals(18, Century.century(1705));
    assertEquals(19, Century.century(1900));
    assertEquals(17, Century.century(1601));
    assertEquals(20, Century.century(2000));
    assertEquals(1, Century.century(89));
  }

  @Test
  public void testDigPow() {
    assertEquals(1, DigPow.digPow(89, 1));
    assertEquals(-1, DigPow.digPow(92, 1));
    assertEquals(51, DigPow.digPow(46288, 3));
  }

  @Test
  public void testOddOrEven() {
    assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
  }

  @Test
  public void testDivisibleNb() {
    assertEquals(true, DivisibleNb.isDivisible(12, 4, 3));
    assertEquals(false, DivisibleNb.isDivisible(3, 3, 4));
  }

  @Test
  public void testOrder() {
    assertEquals(Order.order("Empty input should return empty string"), "");
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
