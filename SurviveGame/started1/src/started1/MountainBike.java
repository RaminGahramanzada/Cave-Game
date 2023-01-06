/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package started1;

/**
 *
 * @author Lenovo
 */
public class MountainBike extends Bicycle {
    int power = 0;
    
    void powerUp (int increment){
    power =power +increment;
    }
    void printStates(){
   System.out.println("Power:"+power);
    }
}

