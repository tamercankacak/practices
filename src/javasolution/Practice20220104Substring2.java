package javasolution;

// https://www.hackerrank.com/challenges/java-string-compare/problem
@SuppressWarnings("ALL")
public class Practice20220104Substring2 {
  public static void main(String[] args) {
    System.out.println(getSmallestAndLargest(
            "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs",
            30));
  }

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0,k);
    String largest = s.substring(0,k);

    for (int i = 0; i < s.length() - k; i++) {
      String temp = s.substring(i, i+k);
      if (temp.compareTo(largest) > 0) largest = temp;
      if (temp.compareTo(smallest) < 0) smallest = temp;
    }

    return smallest + "\n" + largest;
  }
}
