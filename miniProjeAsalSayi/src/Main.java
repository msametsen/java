public class Main {
    public static void main(String[] args) {
       int number = 23;
       int remainder = number % 2;
       System.out.println(remainder);
       boolean isPrime = true; //asal mı

       for(int i=2; i<number;i++) {
           if(number % i == 0) {
               isPrime = false;
           }
       }

       if(isPrime==true) {
           System.out.println("Sayı Asaldır.");
       }else{
           System.out.println("Sayı Asal Değildir.");
       }

    }
}