package org.example.sort;

import java.util.*;

public class SumTriangle {


    protected static HashMap<String, int[]> triangleWithHashMap(int depth, HashMap<String, int[]> trig){


        if(depth <= 0 ) { return (HashMap<String, int[]>) Collections.EMPTY_MAP; }
        if(depth ==1 ) {
            int[] level = new int[]{1};
            trig.put("1",level);
            //break when depth ==1
        } else{
            //depth>0
            trig = triangleWithHashMap(depth-1, trig);
            int[] previousLevel = trig.get(String.valueOf(depth-1));
            int[] level = new int[depth];
            level[0]=level[depth-1]=1;
            for(int i=1; i<depth-1; i++){
                level[i] = previousLevel[i]+previousLevel[i-1];
            }
            trig.put(String.valueOf(depth), level);
        }
        return trig;
    }

}
