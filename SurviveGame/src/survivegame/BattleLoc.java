
package survivegame;


public abstract class BattleLoc extends Location {

    protected Obstacle obstacle;
    protected String award;

    BattleLoc(Player player, String name, Obstacle obstacle, String award) {
        super(player);
        this.obstacle = obstacle;
        this.name = name;
        this.award = award;
    }

    public boolean getLocation() {
        int obsCount = obstacle.Count();
        System.out.println("Now you are here :" + this.getName());
        System.out.println("Be careful! There have " + obsCount + obstacle.getName());
        System.out.println("<W>ar or <E>scape");
        String selCase = scan.nextLine();
        selCase = selCase.toUpperCase();
        if (selCase.equals("W")) {
            if (combat(obsCount)) {
                System.out.println("Clear all the zombies in the  " + this.getName() + " zone");
                if (this.award.equals("Food") && player.getInv().isFood() == false) {
                    System.out.println(this.award +" "+"You win");
                    player.getInv().setFood(true);
                    
                } else if (this.award.equals("Water") && player.getInv().isWater() == false) {
                    System.out.println(this.award +" "+"You win");
                    player.getInv().setWater(true);
                    
                } else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false) {
                    System.out.println(this.award +" "+ "You win");
                    player.getInv().setFirewood(true);
                }
                    return true;
                  
                    
                }  if(player.getHealty()<=  0){
                System.out.println("you died");
                return false;
            }

                
           
            }
                return true;
            }
    

    public boolean combat(int obsCount) {

        for (int i = 0; i < obsCount; i++) {
            int defObsHealth = obstacle.getHealth();
            playerStats();
            enemyStats();
            while (player.getHealty() > 0 && obstacle.getHealth() > 0) {
                System.out.println("<W>ar or <E>scape");
                String selCase = scan.nextLine();
                selCase = selCase.toUpperCase();
                if (selCase.equals("W")) {
                    System.out.println("Your atack!");
                    obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
                    afterHit();
                    if (obstacle.getHealth() > 0) {
                        System.out.println(obstacle.getName() + "Health:" + obstacle.getHealth());
                    }
                    System.out.println("Monster's atack!");
                    player.setHealty(player.getHealty() - (obstacle.getDamage() - player.getInv().getArmor()));
                    afterHit();
                } else {
                    return false;
                }
            }
            if (obstacle.getHealth() < player.getHealty() ) {
                System.out.println("You killed Monsters!");
                player.setMoney(player.getMoney() + obstacle.getAward());
                System.out.println("Your current money:" + player.getMoney());
                obstacle.setHealth(defObsHealth);
                

            }else{
            return false;
            }
            System.out.println("================================");
        }
        return true;
    }

    public void playerStats() {
        System.out.println("Player stats\n--------------");
        System.out.println("Helthy:" + player.getHealty());
        System.out.println("Damage" + player.getTotalDamage());
        System.out.println("Money" + player.getMoney());
        if (player.getInv().getDamage() > 0) {
            System.out.println("Weapon" + player.getInv().getwName());
        }
    }

    public void enemyStats() {
        System.out.println("Enemy stats\n--------------");
        System.out.println("Helthy:" +obstacle.getHealth());
        System.out.println("Damage" + obstacle.getDamage());
        System.out.println("Award" + obstacle.getAward());

    }

    public void afterHit() {
        System.out.println("Player's health:" + player.getHealty());
        System.out.println("========================================");
        System.out.println("Monster's health:" + obstacle.getHealth());
    }
}
