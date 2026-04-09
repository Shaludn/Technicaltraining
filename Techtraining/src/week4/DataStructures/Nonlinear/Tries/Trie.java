package week4.DataStructures.Nonlinear.Tries;

import java.util.Arrays;
import java.util.List;

class TrieNode{
    TrieNode[] children;
    boolean wordEnd;
    TrieNode(){
        wordEnd= false;
        children=new TrieNode[26];
    }
}
public class Trie {
    //operaations- insert and search.
    //aryan-{a, r, y , a ,n}
    static void insertWord(TrieNode root, String word){
        /*
        we will start with root and check if the node exists
        if exists, we will traverse via the node.
        if not, we will create one.
         */
        TrieNode curr=root;
        for(char ch:word.toCharArray())  {
            if(curr.children[ch-'a']== null){
                //node doesnt exist
                curr.children[ch-'a']=new TrieNode();
            }
            //Move to the Children node for the next character
            curr=curr.children[ch-'a'];
        }
        curr.wordEnd=true;//we have inserted the word

    }
    static boolean searchWord(TrieNode root, String word){
        TrieNode curr=root;
        for(char ch: word.toCharArray()){
            if(curr.children[ch-'a']==null){
                //The first letter doesnt exist, so the whole world is not present.
                return false;
            }
            curr=curr.children[ch-'a'];
        }
        return curr.wordEnd;
    }
    static boolean startsWith(TrieNode root, String word){
        TrieNode curr=root;
        for(char ch: word.toCharArray()){
            if(curr.children[ch-'a']==null){
                //The first letter doesnt exist, so the whole world is not present.
                return false;
            }
            curr=curr.children[ch-'a'];
        }
        return true;//asked in ACCENTURE
    }
    public static void main(String[] args) {
        TrieNode root=new TrieNode();
        List<String> inputWords= Arrays.asList("sidharth","vaishnav", "sonika", "darshan", "tejas", "sharanya");
        for(String word: inputWords){
            insertWord(root, word);
        }
        List<String> searchWords= Arrays.asList("sidharth","vaishnav", "saurav", "ashank", "sonika", "darshan", "tejas", "sharanya");
        for(String word: searchWords){
            if(searchWord(root, word)){
                System.out.println(word+ " is present in Trie");
            }
            else{
                System.out.println(word+ " is not present in trie");
            }
        }
        System.out.println(startsWith(root, "dar"));
    }
}
