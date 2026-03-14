import java.util.Arrays;

public class IkiliArama {

   
    public static int ara(int[] dizi, int hedef) {
        if (dizi == null || dizi.length == 0) {
            return -1;
        }
        int sol = 0;
        int sag = dizi.length - 1;

        while (sol <= sag) {
            int orta = sol + (sag - sol) / 2;  
            if (dizi[orta] == hedef) {
                return orta;
            }
            if (dizi[orta] < hedef) {
                sol = orta + 1;
            } else {
                sag = orta - 1;
            }
        }
        return -1;
    }

    public static int araRecursive(int[] dizi, int hedef) {
        if (dizi == null || dizi.length == 0) return -1;
        return araRecursive(dizi, hedef, 0, dizi.length - 1);
    }

    private static int araRecursive(int[] dizi, int hedef, int sol, int sag) {
        if (sol > sag) return -1;
        int orta = sol + (sag - sol) / 2;
        if (dizi[orta] == hedef) return orta;
        if (dizi[orta] < hedef) {
            return araRecursive(dizi, hedef, orta + 1, sag);
        } else {
            return araRecursive(dizi, hedef, sol, orta - 1);
        }
    }

    public static void main(String[] args) {
        int[] sayilar = { 1, 3, 5, 7, 9, 11, 13, 15 };  
        int hedef = 7;

        System.out.println("Dizi (sıralı): " + Arrays.toString(sayilar));
        System.out.println("Aranan değer: " + hedef);

        int indeks = ara(sayilar, hedef);
        System.out.println("İteratif sonuç indeks: " + indeks);

        int indeksRec = araRecursive(sayilar, hedef);
        System.out.println("Özyinelemeli sonuç indeks: " + indeksRec);

        int bulunamayan = ara(sayilar, 8);
        System.out.println("8 arandığında: " + bulunamayan + " (bulunamadı = -1)");
    }
}
