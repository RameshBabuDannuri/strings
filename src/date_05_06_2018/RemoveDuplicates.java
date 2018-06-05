package date_05_06_2018;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    static String UsingSorting(String s){
        int n = s.length();
        if (n==0 || n==1 ){
            return s;
        }
        String str = new String();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        int j = 0;
        for (int i=0;i<n-1;i++){
            if (ch[i] != ch[i+1]){
               str += ch[i];
            }

        }
        str += ch[n-1];
        return str;

    }
   static String  UsingIndexOfMethod(String s){
        String result  = new String();
        int len = s.length();
        for (int i = 0 ;i<len ;i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) < 0) {
                result = result+c;
            }
        }
        return result;
    }
    void remove(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i<str.length();i++){
            set.add(str.charAt(i));
        }
        for (Character ch: set){
            System.out.print(ch);
        }
    }
    public static void main(String args[]){
        RemoveDuplicates object = new RemoveDuplicates();
        String s = "rameshbabudannuri";
        object.remove(s);
        System.out.println();
        String s2 = "abcaabcd";
       System.out.println(UsingSorting(s2));
       // UsingSorting(s2);

    }
}
