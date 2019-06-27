package Scjp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TryMe {
      Integer A;
       int a;
       public TryMe(int a) {
           this.a = A + a;
           System.out.print(this.a);
       }
       public static void main(String args[]) {        
           //Integer A = new Integer("1b");
         //  System.out.print(A);
         // TryMe t = new TryMe(A);
          Character b = 'd'; 
          
          Map<Integer,String> mp=new HashMap<Integer,String>();
          mp.put(1, "a");
          mp.put(2, "b");
          mp.put(3, "c");
          mp.put(4, "f");
          mp.put(5, "g");
         System.out.println( mp.entrySet());
         Iterator<Entry<Integer, String>> s=mp.entrySet().iterator();
         
         for(Entry<Integer,String> s1:mp.entrySet())
         {
        	// s1.g
         }
         
         ArrayList a=new ArrayList();
         a.add(1);
         a.add("d");
         a.add(23.32);
         
         
         
          
          System.out.println(mp.size());
          
      }
  }