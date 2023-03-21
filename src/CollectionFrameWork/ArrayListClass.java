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
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        
        list.add('A');
        list.add('Z');
        list.add('B');
        list.add('Q');
        list.add('K');
        ArrayList duplist=new ArrayList()
                ;
      //  duplist=list;
      duplist.add('M');
        duplist.addAll(list);
        System.out.println(duplist);
        //sorting 
        Collections.sort(duplist);
        System.out.println("after sorting "+duplist);
        Collections.sort(duplist, Collections.reverseOrder());
        System.out.println("in reversr order "+duplist);
        Collections.shuffle(duplist);
        System.out.println(duplist);
        
        
        //CONVERT ARRAY INTO ARRAYLIST 
        String arr[]={"vishal","chandravanshi","jawariya"};
        for(String v:arr)
        {
            System.out.println(v);
        }
        ArrayList al=new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
