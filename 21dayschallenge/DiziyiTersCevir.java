import java.util.Arrays;

/**
 * Day 5: Diziyi Tersine Çevirme (Reverse an array)
 * Dizinin elemanlarını yerinde (in-place) veya yeni dizi olarak tersine çevirir. Karmaşıklık: O(n)
 */
public class DiziyiTersCevir {

    /**
     * Diziyi yerinde tersine çevirir. Orijinal dizi değişir.
     * @param dizi Tersine çevrilecek dizi (üzerinde değişiklik yapılır)
     */
    public static void tersCevirYerinde(int[] dizi) {
        if (dizi == null || dizi.length <= 1) return;
        int sol = 0;
        int sag = dizi.length - 1;
        while (sol < sag) {
            int gecici = dizi[sol];
            dizi[sol] = dizi[sag];
            dizi[sag] = gecici;
            sol++;
            sag--;
        }
    }

    /**
     * Yeni bir dizi döndürür; orijinal dizi değişmez.
     * @param dizi Kaynak dizi
     * @return Ters çevrilmiş yeni dizi
     */
    public static int[] tersCevirYeniDizi(int[] dizi) {
        if (dizi == null) return null;
        if (dizi.length == 0) return new int[0];
        int[] sonuc = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            sonuc[i] = dizi[dizi.length - 1 - i];
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int[] sayilar = { 1, 2, 3, 4, 5 };
        System.out.println("Orijinal dizi: " + Arrays.toString(sayilar));

        // Yerinde ters çevir (orijinal değişir)
        tersCevirYerinde(sayilar);
        System.out.println("Yerinde ters:  " + Arrays.toString(sayilar));

        // Orijinali geri alalım ve yeni dizi ile dene
        tersCevirYerinde(sayilar);
        int[] tersKopya = tersCevirYeniDizi(sayilar);
        System.out.println("Yeni dizi:     " + Arrays.toString(tersKopya));
        System.out.println("Orijinal aynı: " + Arrays.toString(sayilar));
    }
}
