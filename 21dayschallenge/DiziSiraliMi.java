import java.util.Arrays;

public class DiziSiraliMi {

    // Artan (non-decreasing) sırayı kontrol eder.
    public static boolean artanMi(int[] dizi) {
        if (dizi == null || dizi.length <= 1) return true;

        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] > dizi[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Azalan (non-increasing) sırayı kontrol eder.
    public static boolean azalanMi(int[] dizi) {
        if (dizi == null || dizi.length <= 1) return true;

        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] < dizi[i + 1]) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean siraliMi(int[] dizi) {
        return artanMi(dizi) || azalanMi(dizi);
    }

    public static void main(String[] args) {
        int[] artan = {1, 2, 2, 5, 9};
        int[] azalan = {9, 7, 7, 3, 1};
        int[] siraliDegil = {1, 3, 2, 4};

        System.out.println("Artan dizi: " + Arrays.toString(artan));
        System.out.println("Artan mi? " + artanMi(artan));
        System.out.println("Sirali mi? " + siraliMi(artan));
        System.out.println();

        System.out.println("Azalan dizi: " + Arrays.toString(azalan));
        System.out.println("Azalan mi? " + azalanMi(azalan));
        System.out.println("Sirali mi? " + siraliMi(azalan));
        System.out.println();

        System.out.println("Sirali olmayan dizi: " + Arrays.toString(siraliDegil));
        System.out.println("Artan mi? " + artanMi(siraliDegil));
        System.out.println("Azalan mi? " + azalanMi(siraliDegil));
        System.out.println("Sirali mi? " + siraliMi(siraliDegil));
    }
}

