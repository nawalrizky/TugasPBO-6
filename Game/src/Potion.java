public class Potion extends Weapon implements IUse{
    private int duration;
    private int effectPotion;
    private String tipe;

    public Potion(String nama, String rank, int price, int duration, int effectPotion, String tipe) {
        super(nama, rank, price);
        this.duration = duration;
        this.effectPotion = effectPotion;
        this.tipe = tipe;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getEffectPotion() {
        return effectPotion;
    }

    public void setEffectPotion(int effectPotion) {
        this.effectPotion = effectPotion;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    @Override
    public void use() {
        if(tipe.toLowerCase().equals("attack")){
            System.out.println("Damage Dealt by " + getEffectPotion());
        }else if(tipe.toLowerCase().equals("heal")){
            System.out.println("Healed by " + getEffectPotion());
        }
    }
}
