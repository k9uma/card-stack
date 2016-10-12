/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardstackapplication.logic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author SonOfBatman
 */
public class CalcDistribution {
     public static void sortList (List<String> myList){
        Set<String> hashsetList = new HashSet<String>(myList);
        System.out.printf("\nUnique values using HashSet: %s%n", hashsetList);
 
        Set<String> treesetList = new TreeSet<String>(myList);
        System.out.printf("\nUnique values using TreeSet - Sorted order: %s%n", treesetList);
    }
    
}
