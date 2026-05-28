package Trie.Intro;

public class Trie {
    class Node{
        Node[] links=new Node[26];
        boolean flag=false;
        public boolean containsKey(char ch){
            return (links[ch-'a']!=null);
        }
        public void put(char ch,Node node){
            links[ch-'a']=node;
        }
        Node get(char ch){
            return links[ch-'a'];
        }
        void setEnd(){
            flag=true;
        }
    }
    private static Node root;
    Trie(){
        root=new Node();
    }
    public void insert(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            //move to reference trie
            node=node.get(word.charAt(i));
        }
        node.setEnd();
    }
    public boolean search(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            node=node.get(word.charAt(i));
        }
        return node.flag;
    }
    public boolean startsWith(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            node=node.get(word.charAt(i));
        }
//        return !node.flag;
        return true;
    }
}
