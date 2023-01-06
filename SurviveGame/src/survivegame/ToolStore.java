
package survivegame;

import java.util.Scanner;


public class ToolStore  extends NormalLocation{

    public ToolStore(Player player) {
        super(player, "Market");
        
    }
    public boolean getLocation(){
        System.out.println("Money :" +player.getMoney());
        System.out.println("1.Weapons");
        System.out.println("2.Armors");
        System.out.println("3.Exit");
        System.out.println("Your selection:");
        int selTool = scan.nextInt();
        int selItemID;
        
        switch(selTool){
            case 1:
               selItemID= weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID =armorMenu();
                buyArmor(selItemID);
                break;
                
            default:
                break;
        }
        
    return true;
    }
    public int armorMenu(){
     System.out.println("1. Weak armor\t   <Money : 15 -   Damage : 1 ");
    System.out.println("2. Middle armor\t <Money : 25 -   Damage : 3 ");
    System.out.println("3. Strong armor\t   <Money : 40 - Damage :5 ");
    System.out.println("4. Exit");
    System.out.println("Selected Weapon : ");
    int selArmorID = scan.nextInt();
    return  selArmorID;
    }
    public void buyArmor(int itemID){
    
        int avoid = 0,price = 0;
        String aName = null;
        switch(itemID){
            case 1:
              avoid =1;
              aName = "Weak armor";
              price=15;
              
                break;
            case 2:
                avoid =3;
              aName = "Middle armor";
              price=25;
                break;
            case 3:
                avoid =5;
              aName = "Strong armor";
              price=40;
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Error"); 
                break;
                
        }
        if(player.getMoney()>=price && (price >0)){
      player.getInv().setDamage(avoid);
     player.getInv().setArmor(avoid);
     player.getInv().setaName(aName);
       System.out.println("You bought : "+aName  +"\tBlocked damage:"+player.getInv().getArmor());
        System.out.println("Residual money :"+player.getMoney());
        }else{
        System.out.println("Yau haven't enough money");
        }
        
        
    }
    
    public int weaponMenu(){
    
    System.out.println("1. Gun\t   <Money : 25 -   Damage : 2 ");
    System.out.println("2. Sword\t <Money : 35 -   Damage : 3 ");
    System.out.println("3. Charm\t   <Money : 45 - Damage :7 ");
    System.out.println("4. Exit");
    System.out.println("Selected Weapon : ");
    int selWeaponID = scan.nextInt();
    return  selWeaponID;
    
    }
    public void buyWeapon(int itemID){
        int damage = 0,price = 0;
        String wName = null;
        switch(itemID){
            case 1:
              damage =2;
              wName = "Gun";
              price=25;
              
                break;
            case 2:
                damage =3;
              wName = "Sword";
              price=35;
                break;
            case 3:
                damage =7;
              wName = "Charm";
              price=45;
                break;
             case 4:
                System.out.println("Exit");
                break;
            
            default:
                System.out.println("Error"); 
                break;
                
        }
        if(player.getMoney()>price && (price >0)){
      player.getInv().setDamage(damage);
      player.getInv().setwName(wName);
      player.setMoney(player.getMoney()-price);
       System.out.println("You bought : "+wName + "\tTotal damage:"+player.getTotalDamage());
        System.out.println("Residual money :"+player.getMoney());
        }else{
        System.out.println("Yau haven't enough money");
        }
       
        
    
    }
}
