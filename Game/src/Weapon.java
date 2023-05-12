public class Weapon {
    private String nama;
    private String rank;
    private int price;

    public Weapon(String nama, String rank, int price) {
        this.nama = nama;
        this.rank = rank;
        this.price = price;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
