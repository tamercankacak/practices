package coderwars;

public class FakeBinary {
  public static String fakeBin(String numberString) {
    String newStr = "";
    for (char letter : numberString.toCharArray()) {
      newStr += Character.getNumericValue(letter) < 5 ? 0 : 1;
    }
    return newStr;
  }

  public static String fakeBinCodeWars(String numberString) {
    return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
  }
}
