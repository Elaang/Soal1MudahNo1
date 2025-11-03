package Sekolah.UKL;
import java.util.Scanner;
public class EkspedisiAjaTerusWok {
     public static void main(String[] args) {
        double panjang = 0, lebar = 0, tinggi = 0, volume = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Jadi, ini adalah program untuk menghitung biaya pengiriman paket.");
        System.out.println("Nah, kamu pasti punya kan paket yang mau dikirim?");
        System.out.println("ada / gak?");
        String jawab = input.nextLine();
        if (jawab.equalsIgnoreCase("gak")) {
            System.out.println("Gajelas. Sana pergi jauh jauh!");
            System.exit(0);
        } else if (jawab.equalsIgnoreCase("ada")) {
            System.out.println("===============================================");
            System.out.println("        PROGRAM PERHITUNGAN BIAYA PENGIRIMAN   ");
            System.out.println("===============================================");
            System.out.println("Detail Biaya Pengiriman:");
            System.out.println("- Jarak <= 10 km     : Rp 4.250 per kg");
            System.out.println("- Jarak > 10 km      : Rp 6.000 per kg");
            System.out.println("- Volume > 100 cm³   : Tambahan Rp 50.000");
            System.out.println("===============================================");
            System.out.println();
            System.out.println("Baca dulu ini!");
            System.out.println("Udah kau baca KAN?");
            System.out.println("males / udah");
            String baca = input.next();
                if (baca.equalsIgnoreCase("males")) {
                    System.out.println("Yowes, sana pergi jauh jauh!");
                    System.exit(0);
                } else if (baca.equalsIgnoreCase("udah")) {
                    System.out.println("Oke deh, lanjut.");
                    System.out.print("Masukkan berat paket (kg): ");
                        double berat = input.nextDouble();

                    System.out.print("Masukkan jarak tempuh (km): ");
                        double jarak = input.nextDouble();
                    System.out.println("ini kan ada volume, kamu tau gak berapa volumenya?");
                    System.out.println("taulah / gatau");
                        String jawabVolume = input.next();
                        if (jawabVolume.equalsIgnoreCase("gatau")) {
                            System.out.println("Yowes, input panjang, lebar sama tinggi biarku hitung ya.");
                            System.out.print("Masukkan panjang paket (cm): ");
                                panjang = input.nextDouble();
                            System.out.print("Masukkan lebar paket (cm): ");
                                lebar = input.nextDouble();
                            System.out.print("Masukkan tinggi paket (cm): ");
                                tinggi = input.nextDouble();
                        } else if (jawabVolume.equalsIgnoreCase("taulah")) {
                            System.out.println("Oke deh, lanjut.");
                            System.out.print("Masukkan volume paket (cm): ");
                                volume = input.nextDouble();
                        } else {
                            System.out.println("Kalo ngetik dipikir mas!");
                            System.exit(0);
                        }
                            if (volume == 0) {
                                volume = panjang * lebar * tinggi;
                            }
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biayaBerat = berat * biayaPerKg;

        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        double total = biayaBerat + biayaVolume;

        System.out.println("\n=== RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Berat paket : " + berat + " kg");
        System.out.println("Jarak tempuh : " + jarak + " km");
        System.out.println("Volume paket : " + volume + " cm");
        System.out.println("Biaya berdasarkan berat : Rp " + biayaBerat);
        System.out.println("Biaya tambahan volume : Rp " + biayaVolume);
        System.out.println("---------------------------------");
        System.out.println("Total biaya pengiriman : Rp " + total);
        input.close();
    } else {
        System.out.println("Kalo ngetik dipikir mas!");
        System.exit(0);
    }
    }
    }
}
