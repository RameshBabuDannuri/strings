package date_05_06_2018;

public class PrintStringN_Equal_Parts {
    static void print(String s , int n){
        int len = s.length();
        int size;
        if (len/n!=0){
            return;
        }
        size = len/n;
        for (int i=0;i<len;i++){
            if (i==size){
                System.out.println();
            }
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        String str = "a_simple_divide_string_quest";

        print(str, 4);
    }

}
