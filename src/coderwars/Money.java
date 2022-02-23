package coderwars;

public class Money {
  public static int calculateYears(double principal, double interest, double tax, double desired) {
    int cnt = 0;
    while (principal < desired) {
      principal += principal * interest * (1 - tax);
      cnt++;
    }
    return cnt;
  }
}
