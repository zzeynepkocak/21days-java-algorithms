import java.util.Arrays;

public class KabarcikSiralama {
    
    public static void sirala(int[] dizi) {
        int n = dizi.length;
        boolean siraliMi;
        for (int i = 0; i < n - 1; i++) {
            siraliMi = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    // Takas işlemi (swap)
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                    siraliMi = false;
                }
            }
            // Eğer iç döngüde hiç takas olmadıysa dizi zaten sıralıdır
            if (siraliMi) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] sayilar = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Sıralamadan önce: " + Arrays.toString(sayilar));
        
        sirala(sayilar);
        
        System.out.println("Sıralamadan sonra: " + Arrays.toString(sayilar));
    }
}
