import java.util.*;

public class Solution {
    public static int sortNew(String str1, String str2) {
        String com1 = str1 + str2;
        String com2 = str2 + str1;
        return com1.compareTo(com2);
    }
    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        String[] str = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, );
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }
    
    
}