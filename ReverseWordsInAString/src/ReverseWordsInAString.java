public class ReverseWordsInAString {

    public static String reverseWords(String s) {

        String [] worldList =s.trim().split("\s++");
        StringBuilder a=new StringBuilder();
        for (int i=worldList.length-1 ;i>=0 ;i--) {
            a.append(worldList[i]);
                   if(i>0){

                       a.append(" ");
                   }
        }

        return a.toString();
    }
}
