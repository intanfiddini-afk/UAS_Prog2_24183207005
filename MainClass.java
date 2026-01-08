import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    static ArrayList<Mahasiswa> listMhs = new ArrayList<>();
    static ArrayList<Dosen> listDsn = new ArrayList<>();
    static ArrayList<MataKuliah> listMK = new ArrayList<>();
    static ArrayList<Nilai> listNilai = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== SISTEM AKADEMIK ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data Dosen");
            System.out.println("3. Input Mata Kuliah");
            System.out.println("4. Input Nilai Mahasiswa");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = input.nextLine();
                    listMhs.add(new Mahasiswa(nim, nama, prodi) {});
                    break;

                case 2:
                    System.out.print("NIDN: ");
                    String nidn = input.nextLine();
                    System.out.print("Nama: ");
                    String dsn = input.nextLine();
                    System.out.print("Mata Kuliah: ");
                    String matkul = input.nextLine();
                    listDsn.add(new Dosen(nidn, dsn, matkul));
                    break;

                case 3:
                    System.out.print("Kode MK: ");
                    String kd = input.nextLine();
                    System.out.print("Nama MK: ");
                    String nmk = input.nextLine();
                    System.out.print("SKS: ");
                    String sks = input.nextLine();
                    listMK.add(new MataKuliah(kd, nmk, sks));
                    break;

                case 4:
                   System.out.println("Pilih Mahasiswa:");
                    for (int i = 0; i < listMhs.size(); i++) {
                        System.out.println(i + ". " + listMhs.get(i).getNama());
                    }
                    int im = input.nextInt();
                    input.nextLine();
                    

                    System.out.println("Pilih Mata Kuliah:");
                    for (int i = 0; i < listMK.size(); i++) {
                        System.out.println(i + ". " + listMK.get(i).getNamaMK());
                    }
                    int ik = input.nextInt();
                    input.nextLine();

                    System.out.print("Tugas: ");
                    double t = input.nextDouble();
                    System.out.print("UTS: ");
                    double ut = input.nextDouble();
                    System.out.print("UAS: ");
                    double ua = input.nextDouble();
                    input.nextLine();
                    
                    listNilai.add(new Nilai(listMhs.get(im), listMK.get(ik),  t, ut, ua));
                    System.out.println("Nilai berhasil ditambahkan");
                    break;
                    

                case 5:
                    System.out.println("\n===== DATA MAHASISWA =====");
                    for (Mahasiswa m : listMhs) {
                        m.tampilInfo();
                    }

                    System.out.println("\n===== DATA NILAI =====");
                    for (Nilai n : listNilai) {
                        System.out.println("Nama: " + n.getMahasiswa().getNama());
                        System.out.println("Nilai Akhir: " + n.hitungNilaiAkhir());
                    }
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilihan != 0);
    }
}
