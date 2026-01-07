public abstract class User {
    // Poin 5.5: Semua variabel private (Encapsulation)
    protected String id;
    protected String nama;

    // Poin 5.4: Default constructor
    public User() {}

    // Poin 5.4: Constructor dengan parameter
    public User(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Poin 4.1 & 5.6: Abstract method untuk di-override
    public abstract void tampilInfo();

    // Getter dan Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
}