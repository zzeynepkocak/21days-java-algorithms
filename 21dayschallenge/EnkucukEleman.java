
public class EnkucukEleman {

    public static int enKucukBul(int[] dizi) {
        if (dizi == null || dizi.length == 0) {
            return Integer.MAX_VALUE;
        }

        int enKucuk = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }
        return enKucuk;
    }

    public static int enKucukIndeks(int[] dizi) {
        if (dizi == null || dizi.length == 0) {
            return -1;
        }

        int indeks = 0;
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] < dizi[indeks]) {
                indeks = i;
            }
        }
        return indeks;
    }

    public static void main(String[] args) {
        int[] sayilar = {3, 7, 2, 9, 1, 5, 8};

        int enKucuk = enKucukBul(sayilar);
        int indeks = enKucukIndeks(sayilar);

        System.out.println("Dizi: " + java.util.Arrays.toString(sayilar));
        System.out.println("En küçük eleman: " + enKucuk);
        System.out.println("En küçük elemanın indeksi: " + indeks);
    }
}

