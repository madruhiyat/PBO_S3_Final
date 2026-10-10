
import java.util.HashMap;

public class MainInventaris {

    public static void main(String[] args) {

        HashMap<String, Produk> mapInventaris = new HashMap<>();

        mapInventaris.put("001", new Produk("001", "laptop", 20));
        mapInventaris.put("002", new Produk("002", "HP", 30));
        mapInventaris.put("003", new Produk("003", "PC", 40));
        mapInventaris.put("004", new Produk("004", "Monitor", 50));
        mapInventaris.put("005", new Produk("005", "Mouse", 10));

        System.out.println("DAFTAR PRODUK AWAL");
        tampilkanProduk(mapInventaris);

        System.out.println("=============================");

        System.out.println("UPDATE STOK PRODUK");

        Produk produkUpdate = mapInventaris.get("003");

        if (produkUpdate != null) {
            produkUpdate.setStokProduk(25);
            System.out.println("STOK (" + produkUpdate.getNamaProduk() + ") BERHASIL DIUBAH MENJADI " + produkUpdate.getStokProduk());
        } else {
            System.out.println("PRODUK TIDAK DITEMUKAN");
        }

        System.out.println("=============================");

        System.out.println("DAFTAR SETELAH UPDATE");
        tampilkanProduk(mapInventaris);

        System.out.println("=============================");

        System.out.println("HAPUS PRODUK");

        String kodeHapus = "003";

        Produk produkHapus = mapInventaris.get(kodeHapus);

        if (produkHapus != null) {
            mapInventaris.remove(kodeHapus);

            System.out.println("PRODUK (" + produkHapus.getNamaProduk() + ") BERHASIL DIHAPUS");
        } else {
            System.out.println("PRODUK TIDAK DITEMUKAN");
        }

        System.out.println("=============================");

        System.out.println("DAFTAR PRODUK AKHIR");
        tampilkanProduk(mapInventaris);
    }

    // Method untuk menampilkan produk dan total stok
    public static void tampilkanProduk(
            HashMap<String, Produk> mapInventaris) {

        int totalStok = 0;

        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);

            System.out.println(p.getIdProduk() + " | " + p.getNamaProduk() + " | Stok: " + p.getStokProduk()
            );

            totalStok += p.getStokProduk();
        }

        System.out.println("JUMLAH JENIS PRODUK: " + mapInventaris.size());

        System.out.println("TOTAL SELURUH STOK: " + totalStok);
    }
}
