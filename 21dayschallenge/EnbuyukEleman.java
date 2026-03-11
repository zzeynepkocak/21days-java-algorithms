/**
 * Dizideki en büyük elemanı bulur.
 * @param dizi Tamsayı dizisi
 * @return En büyük eleman; dizi boşsa Integer.MIN_VALUE
 */
public class EnbuyukEleman{
    public static int enBuyukBul(int[]dizi){
        if(dizi==null || dizi.length==0){
            return Integer.MIN_VALUE;
        }
        int enBuyuk=dizi[0];
        for(int i=1; i<dizi.length;i++){
            if(dizi[i]>enBuyuk){
                enBuyuk=dizi[i];

            }
        } return enBuyuk;
    }

    public static int enBuyukIndeks(int[]dizi){
        if(dizi==null|| dizi.length==0){
            return -1;
        }
        int indeks=0;
        for(int i=1;i<dizi.length;i++){
            if(dizi[i]>dizi[indeks]){
                indeks=i;
            }
        } return indeks;
    }
    public static void main(String[]args){
        int[] sayilar={3,7,2,9,1,5,8};
        int enBuyuk=enBuyukBul(sayilar);
        int indeks= enBuyukIndeks(sayilar);

        System.out.println("Dizi" + java.util.Arrays.toString(sayilar));
        System.out.println("En büyük eleman: " + enBuyuk);
        System.out.println("En büyük elemanın indeksi: " + indeks);
    }
}