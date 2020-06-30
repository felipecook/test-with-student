package com.felipecook;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.events.Characters;

public class PracticeProblems {


  /*
  * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are
  * removed, but the "a" can be any char. The "yak" strings will not overlap.

    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"

*
*         "yakpak" -> {'y','a','k','p','a','k'}
*
*       ['p', 'a', 'k'] -> {'p','a','k'} -> "pak"
*
*
  * */
  public String stringYak(String str) {

    // turns the string into a char array which is easier to manipulate
    char[] strAsCharArray = str.toCharArray();

    List<Character> modifiedStrAsList = new ArrayList<>();

    for (int i = 0; i < str.length() - 2; i++) {

      char singleElement = strAsCharArray[i];

      if (singleElement == 'y' && strAsCharArray[i + 1] == 'a' && strAsCharArray[i + 2] == 'k') {
        i = i + 3;
      } else {
        modifiedStrAsList.add(singleElement);
      }


    }

  }


  public static void main(String[] args) {


  }



}
