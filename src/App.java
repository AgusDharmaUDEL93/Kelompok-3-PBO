import logic.Bagi;

public class App {
    public static void main(String[] args) {

        // Pembagian menggunakan contructor dan method overload
        Bagi divide1 = new Bagi("6 3");
        System.out.println("Bagi (String) => " + divide1.divide);
        Bagi divide2 = new Bagi(6,3);
        System.out.println("Bagi (int) => " + divide2.divide);
        Bagi divide3 = new Bagi(6.0, 3.0);
        System.out.println("Bagi (double) => " + divide3.divide);
    }
}
