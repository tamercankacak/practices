package coderwars;

public class Factorial {

  public int factorial(int n) {
    if(n < 0 || n > 12) throw new IllegalArgumentException("Useless fuffery!");
    return n <= 1 ? 1 : n * factorial(n - 1);
  }
}
