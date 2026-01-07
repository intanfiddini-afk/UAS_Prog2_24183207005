public class Nilai implements Penilaian {
    private Mahasiswa mahasiswa;
    private MataKuliah matkul;
    private double tugas, uts, uas;

    public Nilai(Mahasiswa mahasiswa, MataKuliah matkul,
                 double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
    }
}
