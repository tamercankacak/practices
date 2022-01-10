package algorithms;

import java.util.Scanner;

public final class Practice20220110Arrays {
  private Practice20220110Arrays() {
    // empty
  }

  /** @param args */
  public static void main(final String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    int budget = scanner.nextInt();
    int keyboardCount = scanner.nextInt();
    int usbCount = scanner.nextInt();
    int[] keyboardList = new int[keyboardCount];
    int[] usbList = new int[usbCount];

    for (int i = 0; i < keyboardCount; i++) {
      keyboardList[i] = scanner.nextInt();
    }

    for (int i = 0; i < usbCount; i++) {
      usbList[i] = scanner.nextInt();
    }
    for (int keyboard : keyboardList) {
      for (int usb : usbList) {
        int total = keyboard + usb;
        if (total <= budget && total > max) {
          max = total;
        }
      }
    }
    System.out.println(max == 0 ? -1 : max);
  }
}
