package week2.Strings;

public class CharFrequency {
    public static void main(String[] args) {
        System.out.println('A'- 'a');
        System.out.println((char)('A'- 'a'));
        String s="sapthagiri";
        int[] freq=new int[26];
        //Pan-gram => a sentence which cotains all aplhabets
        for(int i=0; i < s.length()-1;i++){
            freq[s.charAt(i)- 'a']++;
        }
        for(int i=0;i<26; i++){
            if(freq[i]>0){
                System.out.println((char)(i+'a')+ "=>" + freq[i]);
            }
        }
    }
}
