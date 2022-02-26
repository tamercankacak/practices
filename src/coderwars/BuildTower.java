package coderwars;

public class BuildTower {
  public static String[] TowerBuilder(int nFloors) {
    String[] tower = new String[nFloors];
    int k = 1;
    for (int i = 1; i <= nFloors; i++) {
      String str = "";
      for (int j = 0; j < nFloors - i; j++) str += " ";
      for (int j = 0; j < k; j++) str += "*";
      k += 2;
      for (int j = 0; j < nFloors - i; j++) str += " ";
      tower[i - 1] = str;
    }
    return tower;
  }
}
