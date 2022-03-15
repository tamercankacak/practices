package coderwars;

public class AlternateCapitalization {
  public static String[] capitalize(String s) {
    String[] letters = s.split("");
    String[] first = new String[s.length()];
    String[] second = new String[s.length()];

    for (int i = 0; i < letters.length; i++) {
      if (i % 2 == 0) {
        first[i] = letters[i].toUpperCase();
        second[i] = letters[i];
      } else {
        second[i] = letters[i].toUpperCase();
        first[i] = letters[i];
      }
    }

    return new String[] {String.join("", first), String.join("", second)};
  }

  public static String[] capitalizeCodeWars(String s) {
    String u = s.toUpperCase();
    String o = "";
    String t = "";
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        o += u.charAt(i);
        t += s.charAt(i);
      } else {
        o += s.charAt(i);
        t += u.charAt(i);
      }
    }
    return new String[] {o, t};
  }
}
