package coderwars;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WhoLikesIt {

  public static String whoLikesIt(String... names) {
    int namesLength = names.length;
    if (namesLength == 0) return "no one likes this";
    else if (namesLength == 1) return names[0] + " likes this";
    else if (namesLength == 2) return names[0] + " and " + names[1] + " like this";
    else if (namesLength == 3)
      return names[0] + ", " + names[1] + " and " + names[2] + " like this";
    else return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
  }


  // CodeWars Solution
  public static String whoLikesItCodeWars(String... names) {
    switch (names.length) {
      case 0: return "no one likes this";
      case 1: return String.format("%s likes this", names[0]);
      case 2: return String.format("%s and %s like this", names[0], names[1]);
      case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
      default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
    }
  }


  @Test
  public void staticTests() {
    assertEquals("no one likes this", whoLikesIt());
    assertEquals("Peter likes this", whoLikesIt("Peter"));
    assertEquals("Jacob and Alex like this", whoLikesIt("Jacob", "Alex"));
    assertEquals("Max, John and Mark like this", whoLikesIt("Max", "John", "Mark"));
    assertEquals("Alex, Jacob and 2 others like this", whoLikesIt("Alex", "Jacob", "Mark", "Max"));
  }
}
