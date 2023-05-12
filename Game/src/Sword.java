public class Sword extends Weapon implements IUse{
    private int damage;

    public Sword(String nama, String rank, int price, int damage) {
        super(nama, rank, price);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void use() {
        System.out.println("Damage Dealt by " + getNama() +" is "+ damage);
    }
}
