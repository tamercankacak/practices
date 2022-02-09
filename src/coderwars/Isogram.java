package coderwars;

import org.junit.Test;

import java.util.Locale;

import static junit.framework.TestCase.assertEquals;

/** https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java */
public class Isogram {
  public static boolean isIsogram(String str) {
    str = str.toLowerCase(Locale.ROOT);
    for (char ch : str.toCharArray()) {
      if (str.chars().filter(c -> c == ch).count() > 1) return false;
    }
    return true;
  }

  public static boolean isIsogramCodeWars(String str) {
    return str.length() == str.toLowerCase().chars().distinct().count();
  }

  @Test
  public void FixedTests() {
    assertEquals(true, isIsogram("Dermatoglyphics"));
    assertEquals(true, isIsogram("isogram"));
    assertEquals(false, isIsogram("moose"));
    assertEquals(false, isIsogram("isIsogram"));
    assertEquals(false, isIsogram("aba"));
    assertEquals(false, isIsogram("moOse"));
    assertEquals(true, isIsogram("thumbscrewjapingly"));
    assertEquals(true, isIsogram(""));
  }
}
