public class Main {
    public static void main(String[] args) {


    }

    public static String mergeAlternately(String word1, String word2) {
        String sum="";
        for (int i=0,j=0;i<word1.length()||j<word2.length();i++,j++){
            if(i<word1.length())
                sum=sum+word1.charAt(i);
            if(j<word2.length())
                sum=sum+word2.charAt(j);
        }
        return sum;
    }
}