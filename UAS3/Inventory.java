package UAS3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Inventory {
    private List<Barang> daftarBarang;

    public Inventory() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public List<Barang> cariBarangByNama(String keyword) {
        List<Barang> hasilPencarian = new ArrayList<>();
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equalsIgnoreCase(keyword)) {
                hasilPencarian.add(barang);
            }
        }
        return hasilPencarian;
    }

    public void selectionSortByMerek() {
        Collections.sort(daftarBarang, new Comparator<Barang>() {
            @Override
            public int compare(Barang b1, Barang b2) {
                String merek1 = b1.getMerek().get(0);
                String merek2 = b2.getMerek().get(0);
                return merek1.compareToIgnoreCase(merek2);
            }
        });
    }

    public void tampilkanInventory() {
        for (Barang barang : daftarBarang) {
            System.out.println(barang);
        }
    }
}
