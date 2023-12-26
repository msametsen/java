import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " +mesaj.length()); //length codu stringde kaç karakter olduğunu gösterir
        System.out.println("5.eleman :"+mesaj.charAt(4)); //5.elemanın ne olduğu çıktısını alıyoruz
        System.out.println(mesaj.concat(" Yaşasın!")); //iki string kelimeyi birleştirmek için kullanılır
        System.out.println(mesaj.startsWith("B")); //Bu sorgu B ile başlıyor mu diye sorguluyor
        System.out.println(mesaj.endsWith("l")); //Bu sorgu sonu l ile bitiyor mu diye soruyor.Java case sensetive bir dildir unutma
        System.out.println(mesaj.indexOf('a')); //a harfinin kaçıncı index olduğunu söyler(ilk bulduğunu verir-string kelimede sora bilirsin)
        System.out.print(mesaj.lastIndexOf('e')); //e yi aramaya keliminenin sağından başlar

        System.out.println("----------------------------------------");


        System.out.println(mesaj.replace(' ','-')); //kelimemde bir şeyi bir şeyle değiştirir.Burda boşluklara - işareti koydu
        System.out.println(mesaj.substring(2));//şu indexden itibaren yazdır demek.Yanına bir index numarası daha yazarsan o indexle o index arasını alır.

        for(String kelime: mesaj.split(" ")) {  //kelimleri boşluğa göre alt alta yazdır demek
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());//kelimenin bütün harflerini küçültür
        System.out.println(mesaj.toUpperCase());//kelimenin bütün harflerini büyültür
        System.out.println(mesaj.trim());//burda kullanmadık ama işine yarayabilir kelimenin başında ve sonunda boşluk varsa onları yok eder


    }
}