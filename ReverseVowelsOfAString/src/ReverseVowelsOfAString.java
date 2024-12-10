import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseVowelsOfAString {

    public static String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";
        StringBuilder builder=new StringBuilder(s);
        List<Character> isVowels = new ArrayList<>();
        int say=0;

        for (int i=0;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                     isVowels.add(s.charAt(i));
                     say++;
                 }
        }
        for (int i=0 ,j=say-1;i<s.length()&&j!=0;i++){

            if(vowels.indexOf(s.charAt(i)) != -1){
                builder.setCharAt(i, isVowels.get(j));
                j--;
            }

        }
        say=0;
        return builder.toString();
    }

    public static String reverseVowelsChatGPT(String s) {
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Sol taraftan sesli harf bul
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Sağ taraftan sesli harf bul
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            // Sesli harfleri yer değiştir
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

}
