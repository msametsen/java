// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //For-en çok tercih edilen döngü türüdür
        for(int i=1;i<10;i++) {
            System.out.println(i);
        }

        System.out.println("------------------------");

        for(int a=1;a<10;a+=2) {
            System.out.println(a);
        }

        System.out.println("For Döngüsü Bitti");

        //While
        int i =1;
        while(i<10) {   //i yukarda tanımladım burda olmaz diye düşünme çünkü orda kod blok içinde olduğu için sorun çıkarmaz.
            System.out.println(i);
            i++; //bunu yapmazsan sonsuz loop döndürür
        }
        System.out.println("While Döngüsü Bitti");


        //Do-While(çok çok az kullanılır).Şart Sağlandığı sürece while den hiçbir farkı yoktur.
        int j=1;
        do {
           System.out.println(j);
           j+=2;
        }while(j<10);

        System.out.println("Do-While Döngüsü Bitti");



    }
}