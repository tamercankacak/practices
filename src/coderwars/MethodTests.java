package coderwars;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

/**
 * This class test methods in codewars.
 *
 * @author tamercankacak
 */
public class MethodTests {

  @Test
  public void testMethodTests() {
    assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
  }

  @Test
  public void testAnagramDetection() {

    assertEquals(true, AnagramDetection.isAnagram("foefet", "toffee"));
    assertEquals(true, AnagramDetection.isAnagram("Buckethead", "DeathCubeK"));
    assertEquals(true, AnagramDetection.isAnagram("Twoo", "Woot"));
    assertEquals(false, AnagramDetection.isAnagram("apple", "pale"));
  }

  @Test
  public void testTrue() {
    assertEquals(BooleanToString.convert(true), "true");
    assertEquals(BooleanToString.convert(false), "false");
  }

  @Test
  public void testScramblies() {
    System.out.println("Fixed Tests scramble");
    assertEquals(Scramblies.scramble("rkqodlw", "world"), true);
    assertEquals(Scramblies.scramble("cedewaraaossoqqyt", "codewars"), true);
    assertEquals(Scramblies.scramble("katas", "steak"), false);
    assertEquals(Scramblies.scramble("scriptjavx", "javascript"), false);
    assertEquals(Scramblies.scramble("scriptingjava", "javascript"), true);
    assertEquals(Scramblies.scramble("scriptsjava", "javascripts"), true);
    assertEquals(Scramblies.scramble("javscripts", "javascript"), false);
    assertEquals(Scramblies.scramble("aabbcamaomsccdd", "commas"), true);
    assertEquals(Scramblies.scramble("commas", "commas"), true);
    assertEquals(Scramblies.scramble("sammoc", "commas"), true);
  }

  @Test
  public void testWhichAreIn() {
    String a[] = new String[] {"arp", "live", "strong"};
    String b[] = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
    String r[] = new String[] {"arp", "live", "strong"};
    assertArrayEquals(r, WhichAreIn.inArray(a, b));
  }

  @Test
  public void testReverseLetter() {
    doTest("krishan", "nahsirk");
    doTest("ultr53o?n", "nortlu");
    doTest("ab23c", "cba");
    doTest("krish21an", "nahsirk");
  }

  private void doTest(final String str, final String expected) {
    assertEquals(expected, ReverseLetter.reverseLetter(str));
  }

  @Test
  public void testCalculate() {
    assertEquals("Normal", Calculate.bmi(80, 1.80));
  }

  @Test
  public void testExpandedForm() {
    assertEquals("10 + 2", ExpandedForm.expandedForm(12));
    assertEquals("40 + 2", ExpandedForm.expandedForm(42));
    assertEquals("70000 + 300 + 4", ExpandedForm.expandedForm(70304));
  }

  @Test
  public void testWeightSort() {
    System.out.println("****** Basic Tests ******");
    assertEquals("2000 103 123 4444 99", WeightSort.orderWeight("103 123 4444 99 2000"));
    assertEquals(
        "11 11 2000 10003 22 123 1234000 44444444 9999",
        WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
  }

  @Test
  public void testAreSame() {
    int[] a = new int[] {121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[] {121, 14641, 20736, 361, 25921, 361, 20736, 361};
    assertEquals(true, AreSame.comp(a, b));
  }

  @Test
  public void testMaxMultiple() {
    assertEquals(
        "The largest multiple of 2 between 0 and 7 is 6.", 6, MaxMultiple.maxMultiple(2, 7));
    assertEquals(
        "The largest multiple of 3 between 0 and 10 is 9.", 9, MaxMultiple.maxMultiple(3, 10));
    assertEquals(
        "The largest multiple of 7 between 0 and 17 is 14.", 14, MaxMultiple.maxMultiple(7, 17));
    assertEquals(
        "The largest multiple of 10 between 0 and 50 is 50.",
        50,
        MaxMultiple.maxMultipleCodeWars(10, 50));
    assertEquals(
        "The largest multiple of 37 between 0 and 200 is 185.",
        185,
        MaxMultiple.maxMultiple(37, 200));
    assertEquals(
        "The largest multiple of 7 between 0 and 100 is 98.", 98, MaxMultiple.maxMultiple(7, 100));
  }

  @Test
  public void testProdFib() {
    long[] r = new long[] {55, 89, 1};
    assertArrayEquals(r, ProdFib.productFib(4895));
    r = new long[] {89, 144, 0};
    assertArrayEquals(r, ProdFib.productFib(5895));
  }

  @Test
  public void testLongestConsec() {
    System.out.println("longestConsec Fixed Tests");
    assertEquals(
        LongestConsec.longestConsec(
            new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"},
            2),
        "abigailtheta");
    assertEquals(
        LongestConsec.longestConsec(
            new String[] {
              "ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"
            },
            1),
        "oocccffuucccjjjkkkjyyyeehh");
    assertEquals(LongestConsec.longestConsec(new String[] {}, 3), "");
    assertEquals(
        LongestConsec.longestConsec(
            new String[] {
              "itvayloxrp",
              "wkppqsztdkmvcuwvereiupccauycnjutlv",
              "vweqilsfytihvrzlaodfixoyxvyuyvgpck"
            },
            2),
        "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
    assertEquals(
        LongestConsec.longestConsec(
            new String[] {"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"}, 2),
        "wlwsasphmxxowiaxujylentrklctozmymu");
    assertEquals(
        LongestConsec.longestConsec(
            new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2),
        "");
    assertEquals(
        LongestConsec.longestConsec(
            new String[] {"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3),
        "ixoyx3452zzzzzzzzzzzz");
    assertEquals(
        LongestConsec.longestConsec(
            new String[] {"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 15),
        "");
    assertEquals(
        LongestConsec.longestConsec(
            new String[] {"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0),
        "");
  }

  @Test
  public void testFighter() {
    assertEquals(
        "Lew", Fighter.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
    assertEquals(
        "Harry",
        Fighter.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
    assertEquals(
        "Harald",
        Fighter.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
    assertEquals(
        "Harald",
        Fighter.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
    assertEquals(
        "Harald",
        Fighter.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
    assertEquals(
        "Harald",
        Fighter.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
  }

  @Test
  public void testFakeBinary() {
    FakeBinary fakeBinary = new FakeBinary();
    assertEquals("01011110001100111", fakeBinary.fakeBin("45385593107843568"));
    assertEquals("101000111101101", fakeBinary.fakeBin("509321967506747"));
    assertEquals("011011110000101010000011011", fakeBinary.fakeBin("366058562030849490134388085"));
  }

  @Test
  public void testEmptyArray() throws Exception {
    assertEquals("Empty arrays should have a max of 0", 0, Max.sequence(new int[] {}));
    assertEquals(
        "Example array should have a max of 6",
        6,
        Max.sequence(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  @Test
  public void testPrime() {
    assertFalse("0  is not prime", Prime.isPrime(0));
    assertFalse("1  is not prime", Prime.isPrime(1));
    assertTrue("2  is prime", Prime.isPrime(2));
    assertTrue("73 is prime", Prime.isPrime(73));
    assertFalse("75 is not prime", Prime.isPrime(75));
    assertFalse("-1 is not prime", Prime.isPrime(-1));
    assertTrue("3 is prime", Prime.isPrime(3));
    assertTrue("5 is prime", Prime.isPrime(5));
    assertTrue("7 is prime", Prime.isPrime(7));
    assertTrue("41 is prime", Prime.isPrime(41));
    assertTrue("5099 is prime", Prime.isPrime(5099));
    assertFalse("4 is not prime", Prime.isPrime(4));
    assertFalse("6 is not prime", Prime.isPrime(6));
    assertFalse("8 is not prime", Prime.isPrime(8));
    assertFalse("9 is not prime", Prime.isPrime(9));
    assertFalse("45 is not prime", Prime.isPrime(45));
    assertFalse("-5 is not prime", Prime.isPrime(-5));
    assertFalse("-8 is not prime", Prime.isPrime(-8));
    assertFalse("-41 is not prime", Prime.isPrime(-41));
  }

  @Test
  public void basicTests() {
    int[][] arr = {
      {0, 0},
      {1, 5},
      {3, 5},
      {5, 5},
      {7, 10},
      {39, 40}
    };
    Arrays.stream(arr)
        .forEach(
            (testCase) -> {
              assertEquals(
                  "Input: " + testCase[0],
                  testCase[1],
                  RoundToTheNextMultipleOf5.roundToNext5(testCase[0]));
            });
  }

  @Test
  public void testBasicTrue() {
    String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
    System.out.println(n);
    assertTrue(Nessie.isLockNessMonster(n));
    n = "Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.";
    System.out.println(n);
    assertFalse(Nessie.isLockNessMonster(n));
  }

  @Test
  public void testSequence() {
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, Sequence.reverse(5));
  }

  @Test
  public void testHighestScoringWord() {
    assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
    assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
    assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    assertEquals("aa", HighestScoringWord.high("aa b"));
    assertEquals("b", HighestScoringWord.high("b aa"));
    assertEquals("bb", HighestScoringWord.high("bb d"));
    assertEquals("d", HighestScoringWord.high("d bb"));
    assertEquals("aaa", HighestScoringWord.high("aaa b"));
  }

  @Test
  public void testArithmeticFunction() {
    assertEquals(
        "'add' should return the two numbers added together!",
        3,
        ArithmeticFunction.arithmetic(1, 2, "add"));
    assertEquals(
        "'subtract' should return a minus b!", 6, ArithmeticFunction.arithmetic(8, 2, "subtract"));
    assertEquals(
        "'multiply' should return a multiplied by b!",
        10,
        ArithmeticFunction.arithmetic(5, 2, "multiply"));
    assertEquals(
        "'divide' should return a divided by b!", 4, ArithmeticFunction.arithmetic(8, 2, "divide"));
  }

  @Test
  public void testStringUtils() {
    assertFalse(StringUtils.isDigit(""));
    assertTrue(StringUtils.isDigit("7"));
    assertFalse(StringUtils.isDigit(" "));
    assertFalse(StringUtils.isDigitCodeWars("a"));
    assertFalse(StringUtils.isDigit("a5"));
    assertFalse(StringUtils.isDigitCodeWars("14"));
  }

  @Test
  public void testZywOo() {
    assertEquals(true, ZywOo.validateUsr("regex"));
    assertEquals(false, ZywOo.validateUsr("a"));
    assertEquals(false, ZywOo.validateUsr("Hass"));
    assertEquals(false, ZywOo.validateUsr("Hasd_12assssssasasasasasaasasasasas"));
    assertEquals(false, ZywOo.validateUsr(""));
    assertEquals(true, ZywOo.validateUsr("____"));
    assertEquals(false, ZywOo.validateUsr("012"));
    assertEquals(true, ZywOo.validateUsr("p1pp1"));
    assertEquals(false, ZywOo.validateUsr("asd43 34"));
    assertEquals(true, ZywOo.validateUsr("asd43_34"));
  }

  @Test
  public void testSmileFaces() {
    List<String> a = new ArrayList<String>();
    a.add("4)");
    a.add("o~P");
    a.add("oxP");
    a.add(":D");
    a.add(":)");
    a.add("5D)");
    a.add("'-D");
    a.add("'D");
    a.add("8-)");
    a.add("~;-D");
    a.add("dp)");
    a.add("5-D");
    a.add("'D");
    a.add("opD");
    a.add(";~)");
    a.add(":8p");
    a.add(":8)");
    a.add("')");
    a.add(";D");
    a.add(";pP");
    a.add(";~d");
    a.add("p~)");
    a.add(":x");
    a.add("p~D");
    a.add(";))");
    a.add("p-)x");
    a.add("pP");
    a.add(";X");
    a.add("p(8D");
    a.add(";~d");
    a.add("52)");
    assertEquals(4, SmileFaces.countSmileys(a));
  }

  @Test
  public void testFindDivisor() {
    assertEquals("Should return 1 if the parameter equals 1", 1, FindDivisor.numberOfDivisors(1));
    assertEquals("Should return 3 if the parameter equals 4", 3, FindDivisor.numberOfDivisors(4));
    assertEquals("Should return 2 if the parameter equals 5", 2, FindDivisor.numberOfDivisors(5));
    assertEquals("Should return 6 if the parameter equals 12", 6, FindDivisor.numberOfDivisors(12));
    assertEquals("Should return 8 if the parameter equals 30", 8, FindDivisor.numberOfDivisors(30));
  }

  @Test
  public void testSchool() {
    assertEquals(2, School.getAverage(new int[] {2, 2, 2, 2}));
    assertEquals(3, School.getAverage(new int[] {1, 2, 3, 4, 5}));
    assertEquals(1, School.getAverage(new int[] {1, 1, 1, 1, 1, 1, 1, 2}));
  }

  @Test
  public void testBuildTower() {
    assertEquals(String.join(",", "*"), String.join(",", BuildTower.TowerBuilder(1)));
    assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.TowerBuilder(2)));
    assertEquals(
        String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.TowerBuilder(3)));
  }

  @Test
  public void test() {
    assertEquals(CountDig.nbDig(5750, 0), 4700);
    assertEquals(CountDig.nbDig(11011, 2), 9481);
    assertEquals(CountDig.nbDig(12224, 8), 7733);
    assertEquals(CountDig.nbDig(11549, 1), 11905);
  }

  @Test
  public void testChocolate() {
    assertEquals(24, Chocolate.breakChocolate(5, 5));
    assertEquals(0, Chocolate.breakChocolate(1, 1));
  }

  @Test
  public void testGreeter() {
    assertEquals("should greet some people normally", "Hello, Jim!", Greeter.greet("Jim"));
    assertEquals("should greet some people normally", "Hello, Jane!", Greeter.greet("Jane"));
    assertEquals("should greet some people normally", "Hello, Simon!", Greeter.greet("Simon"));
    assertEquals(
        "should greet Johnny a little bit more special",
        "Hello, my love!",
        Greeter.greet("Johnny"));
  }

  @Test
  public void testCalculateAverage() {
    final double DELTA = 1e-15;
    assertEquals(1, CalculateAverage.find_average(new int[] {1, 1, 1}), DELTA);
    assertEquals(2, CalculateAverage.find_average(new int[] {1, 2, 3}), DELTA);
  }

  @Test
  public void testContains() {
    assertEquals(Contains.check(new Object[] {66, 101}, 66), true);
    assertEquals(Contains.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
    assertEquals(Contains.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
    assertEquals(Contains.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
  }

  @Test
  public void testReverseWords2() {
    assertEquals("eating like I", ReverseWords.reverseWords2("I like eating"));
    assertEquals("flying like I", ReverseWords.reverseWords2("I like flying"));
    assertEquals("nice is world The", ReverseWords.reverseWords2("The world is nice"));
  }

  @Test
  public void countPositivesSumNegatives_BasicTest() {
    int[] expectedResult = new int[] {10, -65};
    assertArrayEquals(
        expectedResult,
        CountPositives.countPositivesSumNegatives(
            new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    expectedResult = new int[] {8, -50};
    assertArrayEquals(
        expectedResult,
        CountPositives.countPositivesSumNegatives(
            new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
  }

  @Test
  public void testClock() {

    assertEquals(61000, Clock.Past(0, 1, 1));
  }

  private int getActualFor(int... numbers) {
    return FindStrayNumber.stray(numbers);
  }

  @Test
  public void testInvertValues() {

    int[] input = new int[] {-1, -2, -3, -4, -5};
    int[] expected = new int[] {1, 2, 3, 4, 5};
    assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

    input = new int[] {-1, 2, -3, 4, -5};
    expected = new int[] {1, -2, 3, -4, 5};
    assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

    input = new int[] {};
    expected = new int[] {};
    assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

    input = new int[] {0};
    expected = new int[] {0};
    assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
  }

  @Test
  public void testASum() {
    assertEquals(2022, ASum.findNb(4183059834009L));
    assertEquals(-1, ASum.findNb(24723578342962L));
    assertEquals(4824, ASum.findNb(135440716410000L));
    assertEquals(3568, ASum.findNb(40539911473216L));
  }

  @Test
  public void testMoney() {
    System.out.println("Fixed Tests calculateYears");
    assertEquals(3, Money.calculateYears(1000, 0.05, 0.18, 1100));
    assertEquals(14, Money.calculateYears(1000, 0.01625, 0.18, 1200));
    assertEquals(0, Money.calculateYears(1000, 0.05, 0.18, 1000));
  }

  @Test
  public void testStringToNumber() {
    assertEquals("stringToNumber(1234)", 1234, StringToNumber.stringToNumber("1234"));
  }

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
