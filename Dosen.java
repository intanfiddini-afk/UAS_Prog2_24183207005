public class Dosen extends User {
    private String matkul;

    public Dosen() {
    }

    public Dosen(String id, String nama, String matkul) {
        super(id, nama);
        this.matkul = matkul;
    }

    @Override
    public void tampilInfo() {
        System.out.println("ID Dosen       : " + id);
        System.out.println("Nama           : " + nama);
        System.out.println("Mata Kuliah    : " + matkul);
    }
}
