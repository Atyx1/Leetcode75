public class CanPlaceFlowers {


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // Eklenebilecek çiçek sayısı
        int i = 0;

        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Çiçek ekle
                count++;
                i += 2; // Bir çiçek yerleştirildiği için bir sonraki alanı atla
            } else {
                i++;
            }
            if (count >= n) return true; // Yeterince çiçek eklenirse true döndür
        }

        return count >= n;
    }



}
