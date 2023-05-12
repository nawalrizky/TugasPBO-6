public class Main {
    public static void main(String[] args) {

        Sword enma = new Sword("enma","SS", 99999999,500000000);
        enma.use();
        Shield crowns = new Shield("Shield of Crowns","S",69000000,100000000);
        crowns.use();
        Potion death = new Potion("Potion of Death","A",7000000,30,100000000,"attack");
        Potion ressurection = new Potion("Angel's Ressurection","A",7000000,30,100000000,"heal");
        death.use();
        ressurection.use();
    }
}
