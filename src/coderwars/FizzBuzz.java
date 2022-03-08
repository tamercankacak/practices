package coderwars;

public class FizzBuzz {

  public static void fizzBuzz(int n) {
    for (int i = 1; i <= n; i++){
      String result = "";
      if (i % 3 == 0) result += "Fizz";
      if (i % 5 == 0) result += "Buzz";
      System.out.println(result != "" ? result : i);
    }
  }
}
