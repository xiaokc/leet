package easy;

import java.util.HashMap;

/**
 * 383. Ransom Note
  Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines, 
 write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;
  otherwise,  it  will  return  false.   

 Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 * Created by xkc on 8/21/16.
 */
public class Solution_383 {
    public static void main(String[] args){
        System.out.println(canConstruct2("aa","ab"));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null
                || ransomNote.length() > magazine.length()){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i ++){
            if (map1.containsKey(ransomNote.charAt(i))){
                map1.put(ransomNote.charAt(i),map1.get(ransomNote.charAt(i))+1);
            }else {
                map1.put(ransomNote.charAt(i),1);
            }
        }

        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < magazine.length(); i ++){
            if (map2.containsKey(magazine.charAt(i))){
                map2.put(magazine.charAt(i),map2.get(magazine.charAt(i))+1);
            }else {
                map2.put(magazine.charAt(i),1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i ++){
            if (! map2.containsKey(ransomNote.charAt(i))
                    || map1.get(ransomNote.charAt(i)) > map2.get(ransomNote.charAt(i))){
                return false;
            }
        }

        return true;
    }

    //更简单的一种方法
    public static boolean canConstruct2(String ransomNote, String magazine){
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i ++){
            arr[magazine.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < ransomNote.length(); i ++){
            if (--arr[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }
        }

        return true;

    }
}
