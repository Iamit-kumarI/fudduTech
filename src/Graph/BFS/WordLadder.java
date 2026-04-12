package Graph.BFS;

import java.util.*;

public class WordLadder {
    /*
    Input: beginWord = "hit", endWord = "cog",
    wordList = ["hot","dot","dog","lot","log","cog"]
    Output: 5
     */
    class Pair{
        String first;
        int second;
        Pair(String first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair>queue=new LinkedList<>();
        queue.offer(new Pair(beginWord,1));
        Set<String> set=new HashSet<>();
        int len=wordList.size();
        for(String cur:wordList)set.add(cur);
        set.remove(beginWord);
        while (!queue.isEmpty()){
            String curWord=queue.peek().first;
            int steps=queue.peek().second;
            queue.remove();
            if(curWord.equals(endWord))return steps;
            for(int i=0;i<curWord.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char []replacementCharArray=curWord.toCharArray();
                    replacementCharArray[i]=ch;
                    String newWord=new String(replacementCharArray);
                    if(set.contains(newWord)){
                        set.remove(newWord);
                        queue.offer(new Pair(newWord,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}
