import java.util.Scanner;

public class Kalkulator {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean loop = true,loop2 = true;
        int pilih = 0;
        String pilih2 ;
        double angka1 = 0,angka2 = 0,hasil = 0;

        System.out.print("Selamat datang di Kalkuman");

        while(loop){
            
            while(loop2){
                System.out.print("\n[1].Penjumlahan\n[2].Pengurangan \n[3].Perkalian \n[4].Pembagian \nPilih Salah Satu : ");
                pilih = scanner.nextInt();
                if(pilih > 4 || pilih <= 0){
                    System.out.print("\nYang kamu pilih tidak ada");
                }else{
                    loop2 = false;
                }
            }

            System.out.print("Masukkan angka pertama : ");
            angka1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua   : ");
            angka2 = scanner.nextDouble();


            if(pilih == 1){
                hasil = angka1 + angka2;
                System.out.println("Hasilnya adalah " + hasil);
            }else if (pilih == 2){
                hasil = angka1 - angka2;
                System.out.println("Hasilnya adalah " + hasil);
            }else if (pilih == 3){
                hasil = angka1 * angka2;
                System.out.println("Hasilnya adalah " + hasil);
            }else if (pilih == 4){
                hasil = angka1 / angka2;
                System.out.println("Hasilnya adalah " + hasil);
            }else{
                System.out.print("Terjadi Kesalahan");
            }

            System.out.print("Mau coba lagi?(Y/N) :");
            pilih2 = scanner.next();

            if(pilih2.equals("N")){
                loop = false;
            }

        }

        System.out.print("\nTerima Kasih sudah mencoba");

        scanner.close();
    }

}
