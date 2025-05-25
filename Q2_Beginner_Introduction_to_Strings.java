/*Problem Description

Write a program to input a String str from user and print count of uppercase and lowercase letters in it.


Problem Constraints

1 <= str.length() <= 103


Input Format

First line contains string str.


Output Format

Print count of uppercase and lowercase letters in str in two seperated lines.


Example Input

ElePHant


Example Output

3
5
 */
import java.lang.*;
import java.util.*;

public class Q2_Beginner_Introduction_to_Strings{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int N=str.length();
        int upper=0;
        int lower=0;
        for(int i=0;i<N;i++)
        {
            if((str.charAt(i)>='a') && (str.charAt(i)<='z'))
                lower++;
            else if((str.charAt(i)>='A') && (str.charAt(i)<='Z'))
                upper++;
        }
        System.out.println(upper);
        System.out.println(lower);
    }
}