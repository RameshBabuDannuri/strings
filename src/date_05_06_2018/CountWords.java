package date_05_06_2018;

import java.util.HashMap;

public class CountWords {
    static final int out = 0;
    static final int in = 1;
   static int count (String s){
       int state = out;
        int wordCount = 0;
        int i =0;
        while (i<s.length()){
            if (s.charAt(i) == ' '){
                state = out;
            }
            else if (state == out){
             state = in;
             ++wordCount;
            }
            ++i;
        }
        return wordCount;
    }
    public static void main(String args[]){
        String s = "my name is ramesh    babu dannuri ";
        System.out.println(count(s));

    }
}
