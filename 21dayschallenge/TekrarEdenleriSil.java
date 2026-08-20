import java.util.Arrays;

public class TekrarEdenleriSil {
    
    public static int[] essizDiziOlustur(int[] dizi) {
        if (dizi == null || dizi.length == 0) {
            return dizi;
        }
        
        // Yardımcı dizi oluştur
        int[] gecici = new int[dizi.length];
        int sayac = 0;
        
        for (int i = 0; i < dizi.length; i++) {
            boolean varMi = false;
            // Eleman geçici dizide var mı kontrol et
            for (int j = 0; j < sayac; j++) {
                if (dizi[i] == gecici[j]) {
                    varMi = true;
                    break;
                }
            }
            
            // Eğer yoksa geçici diziye ekle
            if (!varMi) {
                gecici[sayac++] = dizi[i];
            }
        }
        
        // Sadece dolu olan kısmı kopyala ve döndür
        return Arrays.copyOf(gecici, sayac);
    }

    public static void main(String[] args) {
        int[] sayilar = {4, 2, 7, 4, 8, 2, 9, 4, 1};
        
        System.out.println("Orijinal dizi: " + Arrays.toString(sayilar));
        
        int[] yeniDizi = essizDiziOlustur(sayilar);
        
        System.out.println("Tekrarsiz dizi: " + Arrays.toString(yeniDizi));
    }
}
