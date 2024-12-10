


public class GreatestCommonDivisorOfStrings {



    public String gcdOfStrings(String str1, String str2) {
        String value = str1;
        String otherValue = str2;


        if (str1.length() < str2.length()) {
            value = str1;
            otherValue = str2;
        } else {
            value = str2;
            otherValue = str1;
        }


        for (int i = value.length(); i >= 1; i--) {
            String subString = value.substring(0, i);

            if ((str1.length() % subString.length() == 0) && (str2.length() % subString.length() == 0)) {
                if (isValidPattern(str1, subString) && isValidPattern(str2, subString)) {
                    return subString;
                }
            }
        }
        return "";
    }


    private boolean isValidPattern(String str, String pattern) {
        int len = pattern.length();
        for (int i = 0; i < str.length(); i += len) {
            if (!str.startsWith(pattern, i)) {
                return false;
            }
        }
        return true;
    }



    public String gcdOfStringsChatGPT(String str1, String str2) {
        // Eğer iki string birbiriyle uyumlu değilse, ortak bölen olamaz
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Uzunlukların GCD'sini bul
        int gcdLength = gcd(str1.length(), str2.length());

        // İlk string'in GCD uzunluğundaki kısmını döndür
        return str1.substring(0, gcdLength);
    }

    // İki sayının GCD'sini hesaplayan yardımcı fonksiyon
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


}
