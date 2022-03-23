package coderwars;

public class TotalPoints {
  public static int points(String[] games) {
    int point = 0;
    for (String game : games) {
      String[] scores = game.split(":");
      int x = Integer.parseInt(scores[0]);
      int y = Integer.parseInt(scores[1]);
      point += x > y ? 3 : x == y ? 1 : 0;
    }
    return point;
  }

  public static int pointsCodewars(String[] games) {
    int sum = 0;

    for (String s : games) {
      char x = s.charAt(0), y = s.charAt(2);

      sum += x > y ? 3 : x == y ? 1 : 0;
    }

    return sum;
  }
}
