import java.util.Arrays;

public class SecmeliSiralama {
    
    public static void sirala(int[] dizi) {
        int n = dizi.length;
        
        for (int i = 0; i < n - 1; i++) {
            // İlk olarak i. indeksteki elemanı en küçük varsayıyoruz
            int minIndeks = i;
            
            // Geri kalan elemanlar arasında daha küçüğü var mı diye bakıyoruz
            for (int j = i + 1; j < n; j++) {
                if (dizi[j] < dizi[minIndeks]) {
                    minIndeks = j;
                }
            }
            
            // Eğer i'den küçük bir eleman bulunduysa, yer değiştir (swap)
            if (minIndeks != i) {
                int temp = dizi[minIndeks];
                dizi[minIndeks] = dizi[i];
                dizi[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] sayilar = {64, 25, 12, 22, 11};
        
        System.out.println("Sıralamadan önce: " + Arrays.toString(sayilar));
        
        sirala(sayilar);
        
        System.out.println("Sıralamadan sonra: " + Arrays.toString(sayilar));
    }
}
