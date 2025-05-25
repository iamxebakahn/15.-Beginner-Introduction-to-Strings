/*Problem Description

Take an integer N as input, print the corresponding pattern for N.

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.

For example if N = 5 then pattern will be like:


A _ 
A _ B _ 
A _ B _ C _ 
A _ B _ C _ D _ 
A _ B _ C _ D _ E _ 
If N = 3 then pattern will be like:

A _ 
A _ B _ 
A _ B _ C _ 


Problem Constraints

1 <= N <= 26


Input Format

First and only line of input contains a single integer N.


Output Format

Print the pattern corresponding to the given N.


Example Input

Input 1 :

1

Input 2 :

2

Input 3 :

5


Example Output

Output 1 :

A 

Output 2 :

A 
A B 

Output 5 :

A 
A B 
A B C 
A B C D 
A B C D E  */
import java.lang.*;
import java.util.*;

public class Q3AP_Beginner_Introduction_to_Strings{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char A='A';
        for(int i=1;i<=N;i++)
        {
            A='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(A+" ");
                A++;
            }
            System.out.println();
        }
    }
}