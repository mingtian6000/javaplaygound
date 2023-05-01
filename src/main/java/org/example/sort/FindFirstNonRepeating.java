package org.example.sort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Hello world!
 * give a String, find first-non repeating char in it and return index
 *
 */
public class FindFirstNonRepeating
{
    public static void main( String[] args )
    {
        String str1="lovelydog";
        String str2="aabb";

        System.out.println( findFirstNonRepeatChar(str1) );
        System.out.println( findFirstNonRepeatChar(str2) );
    }

    private static int findFirstNonRepeatChar(String str){
        if(str== null || str.isBlank()){
            return -1;
        } else {
            HashMap<String, Integer> result =new LinkedHashMap<>();
            int count=1;
            for (int i=0; i<str.length(); i++) {
                String tempkey = String.valueOf(str.charAt(i));
                if (!result.containsKey(tempkey)) {
                    result.put(tempkey, count);
                } else {
                    int oldvar = result.get(tempkey).intValue();
                    result.replace(tempkey, oldvar, oldvar+1);
                }
            }
            for(Map.Entry<String, Integer> item: result.entrySet()){
                if(item.getValue().intValue() == 1){
                    // because key is only 1 char,
                    return str.indexOf(item.getKey().charAt(0));
                }
            }
            return -1;
        }

    }
}
