
import java.util.HashMap;

public class MainInventaris {

    public static void main(String[] args) {

        HashMap<String, Produk> mapInventaris = new HashMap<>();

        mapInventaris.put("001", new Produk("001", "laptop", 20));
        mapInventaris.put("002", new Produk("002", "laptop", 20));
        mapInventaris.put("003", new Produk("003", "laptop", 20));
        mapInventaris.put("004", new Produk("004", "laptop", 20));
        mapInventaris.put("005", new Produk("005", "laptop", 20));

        System.out.println("DAFTAR PRODUK AWAL");
        tampilkanProduk(mapInventaris);

        System.err.println("UPADTE STOK PRODUK");

        Produk produkUpdate = mapInventaris.get("003");

        if (produkUpdate != null) {
            produkUpdate.setStokProduk(25);
            System.out.println("Stok Keyboard berhasil diubah menjadi "
                    + produkUpdate.getStokProduk());
        }

        // Menampilkan daftar setelah update
        System.out.println("DAFTAR SETELAH UPDATE");
        tampilkanProduk(mapInventaris);

        // 5. Menghapus satu produk
        System.out.println("HAPUS PRODUK");

        String kodeHapus = "005";

        if (mapInventaris.remove(kodeHapus) != null) {
            System.out.println("Produk " + kodeHapus
                    + " berhasil dihapus.");
        } else {
            System.out.println("Produk tidak ditemukan.");
        }

        // 6. Menampilkan daftar akhir
        System.out.println("DAFTAR PRODUK AKHIR");
        tampilkanProduk(mapInventaris);
    }

    // Method untuk menampilkan produk dan total stok
    public static void tampilkanProduk(
            HashMap<String, Produk> mapInventaris) {

        int totalStok = 0;

        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);

            System.out.println(
                    p.getIdProduk() + " | "
                    + p.getNamaProduk() + " | Stok: "
                    + p.getStokProduk()
            );

            totalStok += p.getStokProduk();
        }

        System.out.println("Jumlah jenis produk: "
                + mapInventaris.size());

        System.out.println("Total seluruh stok: "
                + totalStok);
    }
}
