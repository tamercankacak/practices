package algorithms;

// https://www.hackerrank.com/challenges/day-of-the-programmer/problem
@SuppressWarnings("ALL")
public class Practice20220104Modulus {
  public static void main(String[] args) {
    System.out.println(dayOfProgrammer(2100));
  }

  public static String dayOfProgrammer(int year) {
    if (year < 1918) {
      return year % 4 == 0 ? "12.09." + year : "13.09." + year;
    } else if (year == 1918) {
      return "26.09." + year;
    } else {
      return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
          ? "12.09." + year
          : "13.09." + year;
    }

  }
}
