package coderwars;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Coderspace {}

class InvalidStringException extends Exception {
  InvalidStringException() {}
}

interface MyList {
  void convert(String[] a);
}

class ArrayToList implements MyList {
  ArrayList<String> arrayToList;

  ArrayToList() {
    arrayToList = new ArrayList<>();
  }

  public void convert(String[] a) {
    for (String value : a) {
      arrayToList.add(value);
      System.out.printf(
          "I have added the string: %s at the index: %d\n", value, arrayToList.size() - 1);
    }
  }

  public void replace(int idx) {
    System.out.printf("I have replaced the string: %s with a null string", arrayToList.get(idx));
    arrayToList.set(idx, "");
  }

  public ArrayList<String> compact() {
    return (ArrayList<String>)
        arrayToList.stream().filter(x -> !x.equals("")).collect(Collectors.toList());
  }
}
