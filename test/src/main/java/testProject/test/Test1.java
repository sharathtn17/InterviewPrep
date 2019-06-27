package testProject.test;

import java.util.Collections;
import java.util.LinkedList;

import testProject.test.Util.State;

class Util {
    public enum State{ACTIVE, DELETED, INACTIVE}
}

public class Test1 {     
	public static void printB(String str) {
        System.out.print(Boolean.valueOf(str) ? "true" : "false"); 
   }
   
   public static void main(String args[]) {
       printB("tRuE");
       printB("false");
       printB("jjj");
       printB("");
       
       LinkedList<String> list = new LinkedList<String>();
       list.add("BbB1");
       list.add("bBb2");
       list.add("bbB3");
       list.add("BBb4");
       Collections.sort(list);
       for (String str : list) {
           System.out.print(str + ":");
       }
   }
    
}