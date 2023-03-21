/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFrameWork;

/**
 *
 * @author vishal chandravanshi
 */
import java.util.*;
public class CollectionArrayList {
    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(43);
        al.add("vishal");
        al.add(43.43);
        al.add('v');
        al.add(5332);
        System.out.println(al);
        al.remove(1);
        al.remove(2);
        
        System.out.println(al);
        al.set(0,"chandravanshi");
        al.set(2,"shivam");
        System.out.println(al);
        
        System.out.println(al.get(2));
        
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.contains(43.43));
        System.out.println("");
        al.add(2,"vishal");
        al.add(3,"chandravanshi");
        al.set(3, "java")//   replace not increase directly replace
 ;       
     
        System.out.println(al);
    }
    
    
    
}
