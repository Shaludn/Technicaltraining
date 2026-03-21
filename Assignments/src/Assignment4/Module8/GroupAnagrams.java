package Assignment4.Module8;
import java.util.*;
//LEETCODE 49- GROUP ANAGRAMS
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] str) {
        HashMap<String, List<String>> m = new HashMap<>();
        for (String s : str) {
            int freq[] = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
            if (!m.containsKey(key)){
                m.put(key, new ArrayList<>());
            }
            m.get(key).add(s);
        }
        return new ArrayList<>(m.values());
    }
    public static void main(String[] args) {
        String[] str={"eat", "tea", "ate", "tan", "bat", "tab"};
        String[] str1={};
        System.out.println(groupAnagrams(str));
        System.out.println(groupAnagrams(str1));

    }
}