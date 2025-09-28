package Leetcode.Biweekly.BW166;

import java.util.HashMap;
import java.util.Map;

public class MajorityFreqChar {
    public String majorityFrequencyGroup(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            String val=String.valueOf(c);
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int maxfreq=0,maxlen=0;
        HashMap<Integer,Integer> freqmap=new HashMap<>();
        for(int val:map.values()){
            freqmap.put(val,freqmap.getOrDefault(val,0)+1);
        }
        for(Map.Entry<Integer,Integer> tmap:freqmap.entrySet()){
            int freq=tmap.getKey(),size=tmap.getValue();
            if(size>=maxlen&&freq>maxfreq){
                maxlen=size;
                maxfreq=freq;
            }
        }
        StringBuilder str=new StringBuilder();
        for(Map.Entry<String,Integer> ch:map.entrySet()){
            if(ch.getValue()==maxfreq){
                str.append(ch.getKey());
            }
        }
        return str.toString();
    }
}
