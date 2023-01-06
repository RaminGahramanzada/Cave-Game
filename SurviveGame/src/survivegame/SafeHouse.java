
package survivegame;


public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player) {
        super(player,"SafeHouse");
    }
    public boolean getLocation(){
    player.setHealty(player.getrHealty());
    System.out.println("Your Health is full...");
    System.out.println("Now you are at safe house. ");
    return true;
    }
}
