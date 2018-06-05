package date_05_06_2018;

import java.util.HashSet;

public class PrintDuplicateCharacters {
    static void print(String s) {
      int[] count = new int[256];
      for (int i= 0 ;i<s.length();i++){
          count[s.charAt(i)]++;
      }
      for (int i=0;i<count.length;i++){
          if (count[i]>1){
              System.out.printf("%c, count=%d \n", i,count[i]);
          }
      }
    }

    public static void main(String args[]) {
        String s = "rameshbabudannuri";
        print(s);
    }
}
