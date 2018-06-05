package date_05_06_2018;

public class RemoveDirtyCharactersFromStr1ToStr2 {
    static final int NOC = 256;
   static void remove(String str , String dirty){
        int count[] = new int[NOC];

        for (int i = 0 ;i<dirty.length() ;i++){
            count[dirty.charAt(i)]++;
        }
        int i = 0;
        char arr[] = str.toCharArray();
       StringBuilder result = new StringBuilder();

        while (i != arr.length){
            char temp = arr[i];
            if (count[temp] == 0){
             result = result.append(arr[i]);
            }
            i++;
        }
        System.out.print(result);
    }
    public static void main(String[] args)
    {
        String str = "rameshbabudannuri";
        String dirty_str = "rebu";
        remove(str, dirty_str);
    }
}
