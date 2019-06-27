package testProject.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PermutationsOfString 
{   
    static public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }
     
    private static void StringPermutation(String permutation, String input)
    {   
        if(input.length() == 0)
        {
            System.out.println(permutation);
            HashMap<Integer,Integer> hm=new HashMap();
            Set<Map.Entry<Integer, Integer>> s=hm.entrySet();
            s.contains(hm);
            for(Map.Entry<Integer, Integer> m:s)
            {
            	m.getKey();
            }
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {   
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }
     
    public static void main(String[] args) 
    {
        StringPermutation("JSP");
    }   
}