// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2,4.3,6.4,5.6};
        double total =0;
        double max = myList[0];

        for(double number:myList) {
            if(max<number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam = "+ total);
        System.out.println("En Büyük = "+ max);

    }
}