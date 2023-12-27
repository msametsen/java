public class Main { //methodlar önemlidir sürekli tekrar eden işlemlerde çok büyük kolaylık sağlar aynı kodu tekrar tekrar yazmak verimsiz olur çünkü
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[] {1,2,3,4,5,6};
        int aranacakSayi = 5;
        boolean varMi = false;

        for( int sayi :sayilar) {
            if(sayi==aranacakSayi) {
                varMi = true;
                break;
            }
        }

        if(varMi==true) {
            System.out.println("Sayı Mevcuttur: " +aranacakSayi);
        }else{
            System.out.println("Sayı Mevcut Değildir."+aranacakSayi);
        }
    }


}