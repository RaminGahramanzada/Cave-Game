/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package started1;

/**
 *
 * @author Lenovo
 */
public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    void changeCadence(int newValue){
      cadence =newValue; 
    }
    
    void changeGear (int newValue){
    gear =newValue;
    }
    void speedUp( int increment){
    speed = speed +increment;
    }
    void applyBreakes (int decrement){
    speed =speed-decrement;
    }
    void printStates(){
    System.out.println("cadence:"+cadence+"speed:"+speed+"gear:"+gear);
    }
}


