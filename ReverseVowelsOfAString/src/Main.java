public class Main {
    public static void main(String[] args) {

        String[] testCases = {
                "IceCreAm",    // Beklenen: "AceCreIm"
                "leetcode",    // Beklenen: "leotcede"
                "hello",       // Beklenen: "holle"
                "programming", // Beklenen: "prigrammong"
                "aAeEiIoOuU"   // Beklenen: "UuOoIiEeAa"
        };

        // Her test için fonksiyonu çalıştır
        for (String testCase : testCases) {
            String result = ReverseVowelsOfAString.reverseVowels(testCase);
            System.out.println("Input: " + testCase);
            System.out.println("Output: " + result);
            System.out.println();
        }
    }
}