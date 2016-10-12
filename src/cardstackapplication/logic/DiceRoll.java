/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardstackapplication.logic;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author SonOfBatman
 */
public class DiceRoll {
    /**
     Variable Declaration and Initialization
     */
    int placeholder;
    int dice; 
    HashMap dataStorage = new HashMap();
     public int rollDice(int numDice, int numFaces){
        Random rand = new Random(); 
        final int arraysize = 10000;
        double percentage = 0;

        int counter[] = new int[10000], sum=0;
        // init counter
        for(int i=0; i<10000; i++)
          counter[i] = 0;
        
        for ( int roll1 = 1; roll1 <=10000; roll1++ ) {
            int total = 0; 
            for(int j = 0; j<= numDice; j++){
                dice =  rand.nextInt(numFaces) + 1;
                counter[dice+total]++;
            }
        }
        System.out.println("sum of Faces \t Frequency \t Percentage");

        for(int face=2; face<arraysize;face++)
        {
           percentage = ((double)counter[face]/10000) * 100;
           System.out.println(face + " \t \t " + counter[face] + " \t \t " + 
           percentage);
          sum += counter[face];
        }
        System.out.println("sum: " + sum);
        return placeholder;
     }
    
}
