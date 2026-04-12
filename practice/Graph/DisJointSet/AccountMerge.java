package Graph.DisJointSet;

import Atcoder.ABC424.A;

import java.util.*;

public class AccountMerge {
    public static void main(String[] args) {
        List<List<String>>list=new ArrayList<>();
        System.out.println(accountsMerge(list));
    }
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
        DisjointSetPractice ds=new DisjointSetPractice(n);//re write disjoint set
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String mail=accounts.get(i).get(j);
                if(map.containsKey(mail)){
                    map.put(mail,i);
                }else ds.unionByRank(i,map.get(mail));
            }
        }
        ArrayList<String>[] mergeMail=new ArrayList[n];
        for(int i=0;i<n;i++){
            mergeMail[i]=new ArrayList<String>();
        }
        for(Map.Entry<String,Integer>cur:map.entrySet()){
            String mail=cur.getKey();
            int node=ds.findParent(cur.getValue());
            mergeMail[node].add(mail);
        }
        List<List<String>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(mergeMail[i].isEmpty())continue;
            Collections.sort(mergeMail[i]);
            List<String>cur=new ArrayList<>();
            cur.add(accounts.get(i).get(0));
            for(String str:mergeMail[i])cur.add(str);
            ans.add(cur);
        }
        return ans;
    }
}
