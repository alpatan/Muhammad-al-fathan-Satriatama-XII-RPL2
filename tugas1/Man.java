import java.util.Scanner;

public class Man {
    public static void main(String[] args) {
        // import
        Scanner scanner = new Scanner(System.in);

        // Masukkan input
        System.out.print("Masukkan suhu dalam Celsius: ");

        // Membuat Variabel
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Print 
        System.out.println(celsius + " derajat Celsius sama dengan " + fahrenheit + " derajat Fahrenheit.");
        System.out.println(celsius + " derajat Celsius sama dengan " + kelvin + " Kelvin.");

        // Tutup
        scanner.close();
    }
}
