
package survivegame;

import java.util.Scanner;


public class Game {

    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Survive game");
        System.out.println("Before started game write your name: ");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        player.selectCha();
        start();
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("=========================================================================");
            System.out.println();
            System.out.println("Please choose a location:");
            System.out.println("1. Safetly House --> This house belong to you,there are not any enemy");
            System.out.println("2. Cave --> Maybe you see zombie");
            System.out.println("3. Forest --> Maybe you see Vampire");
            System.out.println("4. Lake --> Maybe you see Bear");
            System.out.println("5. Market -->You can buy weapon or armor");
            int selectLoc = scan.nextInt();
            while (selectLoc < 0 || selectLoc > 5) {
                System.out.println("Please select a valid location:");
                selectLoc = scan.nextInt();
            }
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;

                case 2:
                    location = new Cave(player);
                    break;

                case 3:
                    location = new Forest(player);
                    break;

                case 4:
                    location = new Lake(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (location.name.equals("SafeHouse")) {
                if (player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
                    System.out.println("You win game");
                    break;
                }
            }
                if (!location.getLocation()) {
                System.out.println("Game Over");
                break;
        }
    }
}
}

