
public class Produk {

    private String IdProduk;
    private String NamaProduk;
    private int StokProduk;

    public Produk(String IdProduk, String NamaProduk, int StokProduk) {
        this.IdProduk = IdProduk;
        this.NamaProduk = NamaProduk;
        this.StokProduk = StokProduk;
    }

    public String getIdProduk() {
        return IdProduk;
    }

    public String getNamaProduk() {
        return NamaProduk;
    }

    public int getStokProduk() {
        return StokProduk;
    }

    public void setIdProduk(String IdProduk) {
        this.IdProduk = IdProduk;
    }

    public void setNamaProduk(String NamaProduk) {
        this.NamaProduk = NamaProduk;
    }

    public void setStokProduk(int StokProduk) {
        this.StokProduk = StokProduk;
    }
}
