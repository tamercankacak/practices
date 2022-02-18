package coderwars;

public class Century {
  public static int century(int number) {

    return number % 100 == 0 ? number / 100 : number / 100 + 1;
  }

  public static int centuryCodeWars(int number) {
    return (number + 99) / 100;
  }
}
