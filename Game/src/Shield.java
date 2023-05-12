public class Shield extends Weapon implements IUse{
    private int damageBlock;

    public Shield(String nama, String rank, int price, int damageBlock) {
        super(nama, rank, price);
        this.damageBlock = damageBlock;
    }

    public int getDamageBlock() {
        return damageBlock;
    }

    public void setDamageBlock(int damageBlock) {
        this.damageBlock = damageBlock;
    }

    @Override
    public void use() {
        System.out.println("Damage Mitigated by "+ getNama() + " is " + damageBlock);
    }
}
