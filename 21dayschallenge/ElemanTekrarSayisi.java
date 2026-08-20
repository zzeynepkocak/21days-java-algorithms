import java.util.Arrays;

public class ElemanTekrarSayisi {

    public static int sayac(int[] dizi, int hedef) {
        if (dizi == null || dizi.length == 0) return 0;

        int adet = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == hedef) {
                adet++;
            }
        }
        return adet;
    }

    public static void main(String[] args) {
        int[] sayilar = {3, 4, 5, 6, 7, 5, 9, 5};
        int hedef = 5;

        System.out.println("Dizi: " + Arrays.toString(sayilar));
        System.out.println("Aranan değer: " + hedef);
        System.out.println("Kac kez geciyor? " + sayac(sayilar, hedef));

        int hedef2 = 99;
        System.out.println("Aranan değer: " + hedef2);
        System.out.println("Kac kez geciyor? " + sayac(sayilar, hedef2));
    }
}

