package date_05_06_2018;

public class ReturnMaxumumOccuringCharacter {
    static final int ASCII_SIZE = 256;
   static char Max(String str){
        int max  = -1;
        char result = ' ';
        int count[] = new int[ASCII_SIZE];
        int len = str.length();
        for (int i = 0; i<len ;i++){
            count[str.charAt(i)]++;
        }
        for (int i = 0;i<len; i++){
            if (max<count[str.charAt(i)]){
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;

    }
    public static void main(String args[]){
        String str = "ramesh babu dannuri";
        System.out.println(Max(str));
    }
}
