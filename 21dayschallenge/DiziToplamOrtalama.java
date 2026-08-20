import java.util.Arrays;

public class DiziToplamOrtalama {
    public static void main(String[] args) {
        int[] sayilar = {5, 12, 9, 18, 2, 7};
        
        if (sayilar.length == 0) {
            System.out.println("Dizi boş.");
            return;
        }
        
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        
        double ortalama = (double) toplam / sayilar.length;
        
        System.out.println("Dizi: " + Arrays.toString(sayilar));
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);
    }
}
