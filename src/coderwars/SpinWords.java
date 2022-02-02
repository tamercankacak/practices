package coderwars;

public class SpinWords {
  public static String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    // return Arrays.asList(words).stream().collect(Collectors.joining(" "));
    // codewars ->
    return String.join(" ", words);
  }
}
