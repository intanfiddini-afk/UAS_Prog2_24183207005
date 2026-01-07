public abstract class Mahasiswa {
    protected String nim;
    protected String nama;
    protected String jurusan;

    public static int totalMahasiswa = 0;

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        totalMahasiswa++;
    }

    public String getNama() {
        return nama;
    }

    public void tampilInfo() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Jurusan : " + jurusan);
    }
}
