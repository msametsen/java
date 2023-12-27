public class Main { //void değerleri string integrer gibi değişkenlere atıyamam
    public static void main(String[] args) {
        String mesaj ="Bugün Hava Çok Güzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,5,6,7,8,9);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1,int sayi2) {  //burda void yerine int yazmamını anlamı bu fonksiyon int değer döndürür anlamına geliyor
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar) {  //3 nokta koymamının anlamı birden fazla sayı giricem demek
        int toplam =0;
        for(int sayi:sayilar) {
            toplam = toplam +sayi;
        }
        return  toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }

}