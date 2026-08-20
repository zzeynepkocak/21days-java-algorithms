import java.util.Arrays;

public class ArayaEklemeSiralama {
    
    public static void sirala(int[] dizi) {
        int n = dizi.length;
        
        for (int i = 1; i < n; i++) {
            int secilen = dizi[i];
            int j = i - 1;
            
            // Seçilen elemanı, sol tarafındaki sıralanmış kısımdaki doğru yerine yerleştir
            while (j >= 0 && dizi[j] > secilen) {
                dizi[j + 1] = dizi[j];
                j--;
            }
            dizi[j + 1] = secilen;
        }
    }

    public static void main(String[] args) {
        int[] sayilar = {64, 25, 12, 22, 11};
        
        System.out.println("Sıralamadan önce: " + Arrays.toString(sayilar));
        
        sirala(sayilar);
        
        System.out.println("Sıralamadan sonra: " + Arrays.toString(sayilar));
    }
}
