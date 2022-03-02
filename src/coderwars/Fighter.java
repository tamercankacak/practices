package coderwars;

public class Fighter {
  public String name;
  public int health, damagePerAttack;

  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }

  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    if (!firstAttacker.equals(fighter1.name)) {
      Fighter temp = fighter1;
      fighter1 = fighter2;
      fighter2 = temp;
    }
    while (fighter1.health > 0 && fighter2.health > 0) {
      fighter2.health -= fighter1.damagePerAttack;
      if (fighter2.health <= 0) break;
      fighter1.health -= fighter2.damagePerAttack;
    }
    return fighter1.health > fighter2.health ? fighter1.name : fighter2.name;
  }

  public static String declareWinnerCodeWars(
      Fighter fighter1, Fighter fighter2, String firstAttacker) {
    Fighter a = fighter1, b = fighter2;
    if (firstAttacker.equals(fighter2.name)) {
      a = fighter2;
      b = fighter1;
    }
    while (true) {
      if ((b.health -= a.damagePerAttack) <= 0) return a.name; // a wins
      if ((a.health -= b.damagePerAttack) <= 0) return b.name; // b wins
    }
  }
}
