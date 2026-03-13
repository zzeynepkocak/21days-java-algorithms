import java.util.Arrays;

public class DogrusalArama {

    public static int ara(int[] dizi, int hedef) {
        if (dizi == null) {
            return -1;
        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == hedef) {
                return i;
            }
        }
        return -1;
    }

    public static int sonIndeksBul(int[] dizi, int hedef) {
        if (dizi == null) return -1;
        for (int i = dizi.length - 1; i >= 0; i--) {
            if (dizi[i] == hedef) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sayilar = {3, 4, 5, 6, 7, 5, 9};
        int hedef = 5;
        int indeks = ara(sayilar, hedef);
        int sonIndeks = sonIndeksBul(sayilar, hedef);
        System.out.println("Dizi: " + Arrays.toString(sayilar));
        System.out.println("Aranan değer: " + hedef);
        System.out.println("İlk bulunan indeks: " + indeks);
        System.out.println("Son bulunan indeks: " + sonIndeks);
        int bulunamayan = ara(sayilar, 99);
        System.out.println("99 arandığında sonuç: " + bulunamayan + " (bulunamadı = -1)");
    }

}
