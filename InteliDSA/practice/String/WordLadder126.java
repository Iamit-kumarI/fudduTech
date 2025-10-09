package String;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WordLadder126 {
//    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//        if(!wordList.contains(endWord))return 0;
//        Set<String > visited=new HashSet<>();
//        Queue<String>queue=new LinkedList<>();
//        queue.offer(beginWord);
//        int len=0;
//        while(!queue.isEmpty()){
//            int size=queue.size();
//            len++;
//            for(int i=0;i<size;i++){
//                String cstr=queue.poll();
//                for(int j=0;j<cstr.length();j++){
//                    Character[]temp=cstr.toCharArray();
//                    for(char ch='a';ch<='z';ch++){//hit chck ait bit cit like this
//                        temp[j]=ch;
//                        String newWord=new String(temp);
//                        if(newWord.equals(endWord))return len+1;
//                        if(wordList.contains(newWord)&&!visited.contains(newWord)){
//                            queue.offer(newWord);
//                            visited.add(newWord);
//                        }
//                    }
//                }
//            }
//        }
//        return 0;
//    }
}
