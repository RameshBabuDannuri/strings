package date_05_06_2018;

import java.util.Arrays;

public class AngramOrNot {
    static int NO_OF_CHARS = 256;

    static   boolean  useSorting(String s1 , String s2){
        int n1= s1.length();
        int n2 = s2.length();
        if (n1!=n2){
            return false;
        }
        char[] a = s1.toCharArray();
        char[]  b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i =0;i<s1.length();i++){
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    static boolean areAnagram(char str1[], char str2[])
    {
        int count1[] = new int [NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int [NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;

        for (i = 0; i <str1.length && i < str2.length ;
             i++)
        {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        if (str1.length != str2.length)
            return false;

        for (i = 0; i < NO_OF_CHARS; i++)
            if (count1[i] != count2[i])
                return false;

        return true;
    }
    public static void main(String args[]){
        String s1 = "listen";
        String s2 = "silent";
        if (useSorting(s1,s2)){
            System.out.println("two strings are anagrams of each other");
        }
        else {
            System.out.println("two strings are not anagrams of each other");

        }
    }
}
