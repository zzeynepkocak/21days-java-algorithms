import java.util.Arrays;

public class BirlestirmeliSiralama {
    
    public static void sirala(int[] dizi, int sol, int sag) {
        if (sol < sag) {
            // Ortayı bul
            int orta = sol + (sag - sol) / 2;
            
            // Sol ve sağ yarıları sırala
            sirala(dizi, sol, orta);
            sirala(dizi, orta + 1, sag);
            
            // İki sıralı yarıyı birleştir
            birlestir(dizi, sol, orta, sag);
        }
    }
    
    private static void birlestir(int[] dizi, int sol, int orta, int sag) {
        int n1 = orta - sol + 1;
        int n2 = sag - orta;
        
        int[] solDizi = new int[n1];
        int[] sagDizi = new int[n2];
        
        // Verileri geçici dizilere kopyala
        for (int i = 0; i < n1; ++i)
            solDizi[i] = dizi[sol + i];
        for (int j = 0; j < n2; ++j)
            sagDizi[j] = dizi[orta + 1 + j];
            
        // İki diziyi birleştirerek ana diziye geri yaz
        int i = 0, j = 0;
        int k = sol;
        
        while (i < n1 && j < n2) {
            if (solDizi[i] <= sagDizi[j]) {
                dizi[k] = solDizi[i];
                i++;
            } else {
                dizi[k] = sagDizi[j];
                j++;
            }
            k++;
        }
        
        // Kalan elemanları kopyala
        while (i < n1) {
            dizi[k] = solDizi[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            dizi[k] = sagDizi[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] sayilar = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Sıralamadan önce: " + Arrays.toString(sayilar));
        
        sirala(sayilar, 0, sayilar.length - 1);
        
        System.out.println("Sıralamadan sonra: " + Arrays.toString(sayilar));
    }
}
