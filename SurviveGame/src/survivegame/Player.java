
package survivegame;

import java.util.Scanner;


class Player {

    private int damage, healty, money, rHealty;
    private String name, cName;
    private Inventory Inv;
    Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.Inv = new Inventory();
    }

    public void selectCha() {
        switch (chaMenu()) {

            case 1:
                initPlayer("Samuray", 5, 21, 15);

                break;
            case 2:
                initPlayer("Archer", 7, 18, 20);

                break;
            case 3:
                initPlayer("Knight", 8, 24, 5);

                break;
            default:
                initPlayer("Samuray", 5, 21, 15);
                break;
        }
        System.out.println("Character: " + getcName() + "\t Damage:" + getDamage() + "\t Health:" + getHealty() + "\tMoney" + getMoney());
    }

    public int chaMenu() {
        System.out.println("Please chose a character:");
        System.out.println("1-Samuray \t Damage:5\t Health:21\tMoney:15;");
        System.out.println("2-Archer \t  Damage:7 \tHealth:18\tMoney:20;");
        System.out.println("3-Knight \t  Damage:8\t Health:24\tMoney:5;");
        System.out.println("Your choice:");
        int chaID = scan.nextInt();

        while (chaID < 1 || chaID > 3) {
            System.out.print("Please choice correct character:");
            chaID = scan.nextInt();
        }
        return chaID;

    }
    public int getTotalDamage(){
    return this.getDamage()+this.getInv().getDamage();
    }

    public void initPlayer(String cName, int dmg, int hlthy, int mny) {
        setcName(cName);
        setDamage(dmg);
        setHealty(hlthy);
        setMoney(mny);
        setrHealty(hlthy);

    }

    public Inventory getInv() {
        return Inv;
    }

    public void setInv(Inventory Inv) {
        this.Inv = Inv;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getrHealty() {
        return rHealty;
    }

    public void setrHealty(int rHealty) {
        this.rHealty = rHealty;
    }

}
