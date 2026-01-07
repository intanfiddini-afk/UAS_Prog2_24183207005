public class MataKuliah {
    private String kode;
    private String namaMatkul;
    private int sks;

    public MataKuliah(String kode, String namaMatkul, int sks) {
        this.kode = kode;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    MataKuliah(String kd, String nmk, String sks) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void tampilMatkul() {
        System.out.println(kode + " - " + namaMatkul + " (" + sks + " SKS)");
    }

    String getNamaMK() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
