import java.util.*;
public class Solution {
    public static Map<Character, Integer> makeMap (String a){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<a.length();i++){
            Character ch = a.charAt(i);
            if(!mp.containsKey(ch)) mp.put(ch,1);
            else{
                int freq = mp.get(ch);
                mp.put(ch, freq+1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> mp1 = makeMap(s);
        Map<Character, Integer> mp2 = makeMap(t);
        return mp1.equals(mp2);
    }
}