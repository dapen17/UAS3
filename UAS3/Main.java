package UAS3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        List<String> merekLaptop = new ArrayList<>(Arrays.asList("Acer", "HP", "Lenovo"));
        inventory.tambahBarang(new Barang("Laptop", merekLaptop, 10000000, 1));

        List<String> merekUSB = new ArrayList<>(Arrays.asList("SanDisk", "Kingston", "Toshiba"));
        inventory.tambahBarang(new Barang("USB", merekUSB, 50000, 5));

        List<String> merekFlashdisk = new ArrayList<>(Arrays.asList("Kingston", "Sony", "Toshiba"));
        inventory.tambahBarang(new Barang("Flashdisk", merekFlashdisk, 30000, 10));

        List<String> merekModem = new ArrayList<>(Arrays.asList("Huawei", "ZTE", "D-Link"));
        inventory.tambahBarang(new Barang("Modem", merekModem, 200000, 2));

        List<String> merekVGA = new ArrayList<>(Arrays.asList("NVIDIA", "AMD", "Gigabyte"));
        inventory.tambahBarang(new Barang("VGA", merekVGA, 3000000, 3));

        System.out.println("Inventory sebelum diurutkan:");
        inventory.tampilkanInventory();
        System.out.println();

        inventory.selectionSortByMerek();

        System.out.println("Inventory setelah diurutkan berdasarkan merek:");
        inventory.tampilkanInventory();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang ingin dicari: ");
        String keyword = scanner.nextLine();
        List<Barang> hasilPencarian = inventory.cariBarangByNama(keyword);

        System.out.println("Hasil pencarian barang dengan nama \"" + keyword + "\":");
        if (hasilPencarian.isEmpty()) {
            System.out.println("Tidak ditemukan barang dengan nama \"" + keyword + "\"");
        } else {
            for (Barang barang : hasilPencarian) {
                System.out.println(barang);
            }
        }
    }
}
