package Algorithms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
// https://www.hackerrank.com/challenges/time-conversion
public class _20211222_TimeConversion {
  public static void main(String[] args) {
    System.out.println(timeConversion("07:05:45PM"));
  }

  public static String timeConversion(String s) {
    DateFormat _12HourFormat = new SimpleDateFormat("hh:mm:ssaa");
    DateFormat _24HourFormat = new SimpleDateFormat("HH:mm:ss");
    try {
      s = _24HourFormat.format(_12HourFormat.parse(s));
    } catch (ParseException pe) {
      pe.printStackTrace();
    }
    return s;
  }
}
