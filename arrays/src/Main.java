// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {                           //DİZİLER
    public static void main(String[] args) {
        String ogrenci1="Samet";
        String ogrenci2="Derin";
        String ogrenci3="Ali";
        String ogrenci4="Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println("--------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] ="Samet";
        ogrenciler[1] ="Derin";
        ogrenciler[2] ="Ali";
        ogrenciler[3] ="Ahmet";

        for(int i=0;i<ogrenciler.length;i++){     //length eleman sayısı demek
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------");

        for(String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }


    }
}