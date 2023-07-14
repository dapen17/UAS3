package UAS3;
import java.util.List;

public class Barang {
    private String nama;
    private List<String> merek;
    private int harga;
    private int jumlah;

    public Barang(String nama, List<String> merek, int harga, int jumlah) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public List<String> getMerek() {
        return merek;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "nama='" + nama + '\'' +
                ", merek=" + merek +
                ", harga=" + harga +
                ", jumlah=" + jumlah +
                '}';
    }
}
