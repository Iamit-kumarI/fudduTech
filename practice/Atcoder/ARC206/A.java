package Atcoder.ARC206;
//not solved https://atcoder.jp/contests/arc206/tasks
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* A - Range Replace /
Time Limit: 2 sec / Memory Limit: 1024 MiB

×
It is prohibited to use generative AI in ongoing AtCoder contests. Please refer to the following rules for more details.

AtCoder Rules against Generative AI - Version 20250718


Score :
400 points

Problem Statement
You are given a sequence
A=(A
1
​
 ,…,A
N
​
 ) of length
N. You perform the following operation exactly once.

Choose a pair of integers
(L,R) such that
1≤L≤R≤N. Replace each of
A
L
​
 ,A
L+1
​
 ,…,A
R
​
  with
A
L
​
 .
How many different sequences are possible as
A after the operation?

Constraints
All input values are integers.
1≤N≤10
6

1≤A
i
​
 ≤N
Input
The input is given from Standard Input in the following format:

N
A
1
​

…
A
N
​

Output
Output the answer.

Sample Input 1
Copy
4
1 1 2 3
Sample Output 1
Copy
4
The possible sequences after the operation are the following four sequences:

(1,1,1,1)
(1,1,1,3)
(1,1,2,2)
(1,1,2,3)
For example,
(1,1,1,3) can be obtained by performing the operation with
L=2,R=3.

Sample Input 2
Copy
10
2 5 6 5 2 1 7 9 7 2
Sample Output 2
Copy
41
* */
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(subsequence(arr));
    }
    public static int subsequence(int[]arr){
        int n=arr.length;
        Set<String> set=new HashSet<>();
        for(int left=0;left<n;left++){
            for(int right=left;right<n;right++){
                int []newarr=arr.clone();//each time create a new array of existing array
                //now push left element into the array
                for(int i=left;i<right;i++){
                    newarr[i]=arr[left];
                }
                set.add(Arrays.toString(newarr));
            }
        }
        return set.size();
    }
}
