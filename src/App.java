import logic.Bagi;
import logic.Jumlah;
import logic.Kali;
import logic.Kurang;

public class App {
    public static void main(String[] args) {

        // Penjumlahan menggunakan constructor dan method overload
        Kali multiple1  = new Kali("6 3");
        System.out.println("Kali (String) => " + multiple1.multiple);
        Kali multiple2 = new Kali(6,3);
        System.out.println("Kali (int) => " + multiple2.multiple);
        Kali multiple3 = new Kali(6.0, 3.0);
        System.out.println("Kali (double) => " + multiple3.multiple);

        // Penjumlahan menggunakan constructor dan method overload
        Jumlah sum1  = new Jumlah("6 3");
        System.out.println("Jumlah (String) => " + sum1.sum);
        Jumlah sum2 = new Jumlah(6,3);
        System.out.println("Jumlah (int) => " + sum2.sum);
        Jumlah sum3 = new Jumlah(6.0, 3.0);
        System.out.println("Jumlah (double) => " + sum3.sum);

        // Pengurangan menggunakan constructor dan method overload
        Kurang min1  = new Kurang("6 3");
        System.out.println("Kurang (String) => " + min1.min);
        Kurang min2 = new Kurang(6,3);
        System.out.println("Kurang (int) => " + min2.min);
        Kurang min3 = new Kurang(6.0, 3.0);
        System.out.println("Kurang (double) => " + min3.min);

        // Pembagian menggunakan contructor dan method overload
        Bagi divide1 = new Bagi("6 3");
        System.out.println("Bagi (String) => " + divide1.divide);
        Bagi divide2 = new Bagi(6,3);
        System.out.println("Bagi (int) => " + divide2.divide);
        Bagi divide3 = new Bagi(6.0, 3.0);
        System.out.println("Bagi (double) => " + divide3.divide);
    }
}
