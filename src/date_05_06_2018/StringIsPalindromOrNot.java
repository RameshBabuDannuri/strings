package date_05_06_2018;

public class StringIsPalindromOrNot {
   static boolean isPalindrom(String s){
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while (i<j){
            if (ch[i]!=ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[]){
        String s = "ramar";
        if(isPalindrom(s)){
            System.out.println("palindrom");
        }
        else {
            System.out.println("Not palindrom");
        }

    }
}
