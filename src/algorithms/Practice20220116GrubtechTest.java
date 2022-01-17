package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/** Grubtech Practice. */
public class Practice20220116GrubtechTest {
  public static void main(String[] args) {
    closestNumbers(
        new ArrayList<Integer>() {
          {
              add(-999310610);
              add(-999485016);
              add(-999794293);
              add(-999433017);
              add(-999906838);
              add(-999983721);
              add(-999276109);
              add(-999780009);
              add(-999229128);
              add(-999458012);
              add(-999705296);
              add(-999886886);
              add(-999308397);
              add(-999287709);
              add(-999456729);
              add(-999808159);
              add(-999608243);
              add(-999495517);
              add(-999348665);
              add(-999906511);
              add(-999918539);
              add(-999733540);
              add(-999291135);
              add(-999670461);
              add(-999286241);
              add(-999780851);
              add(-999537725);
              add(-999359335);
              add(-999444947);
              add(-999666202);
              add(-999301275);
              add(-999950175);
              add(-999957126);
              add(-999532040);
              add(-999641735);
              add(-999829292);
              add(-999672952);
              add(-999665807);
              add(-999886230);
              add(-999471660);
              add(-999636400);
              add(-999872241);
              add(-999990804);
              add(-999765411);
              add(-999570510);
              add(-999317770);
              add(-999794845);
              add(-999633159);
              add(-999742929);
              add(-999679783);
              add(-999844594);
              add(-999859724);
              add(-999829462);
              add(-999504314);
              add(-999242624);
              add(-999659625);
              add(-999497304);
              add(-999783131);
              add(-999289140);
              add(-999776183);
          }
        });
  }

  public static void closestNumbers(List<Integer> numbers) {
    List<Integer> sortedNumbers = numbers;
    Collections.sort(sortedNumbers);
    int difference = Math.abs(sortedNumbers.get(1) - sortedNumbers.get(0));
    HashMap<Integer, Integer> closestNumbers =
        new HashMap<Integer, Integer>() {
          {
            put(sortedNumbers.get(0), sortedNumbers.get(1));
          }
        };

    for (int i = 1; i < sortedNumbers.size() - 1; i++) {
      if (Math.abs(sortedNumbers.get(i) - sortedNumbers.get(i + 1)) < difference) {
        closestNumbers.clear();
        closestNumbers.put(numbers.get(i), numbers.get(i + 1));
        difference = Math.abs(sortedNumbers.get(i) - sortedNumbers.get(i + 1));
      } else if (Math.abs(sortedNumbers.get(i) - sortedNumbers.get(i + 1)) == difference) {
        closestNumbers.put(numbers.get(i), numbers.get(i + 1));
      }
    }
    closestNumbers
        .entrySet()
        .forEach(
            entry -> {
              System.out.println(entry.getKey() + " " + entry.getValue());
            });
  }
}
