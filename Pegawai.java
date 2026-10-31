public class Pegawai {
    protected String nama;
    protected String id;

    // Constructor
    public Pegawai(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Method yang akan di-override oleh subclass
    public double hitungGaji() {
        return 0; // Default
    }

    // Method untuk mencetak slip gaji
    public void cetakSlipGaji() {
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : Rp " + hitungGaji());
        System.out.println("---------------------------------");
    }

    // Method untuk mendapatkan nama class asli objek
    public String getTipePegawai() {
        return this.getClass().getSimpleName();
    }
}