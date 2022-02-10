package coderwars;

import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/53dbd5315a3c69eed20002dd
 *
 * @author tamercankacak
 */
public class ListFiltering {
  public static List filterList(final List list) {
    return (List) list.stream().filter(x -> x instanceof Integer).collect(Collectors.toList());
  }
}
