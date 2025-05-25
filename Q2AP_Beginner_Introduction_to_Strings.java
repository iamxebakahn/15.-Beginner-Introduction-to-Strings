/*Problem Description

You are given lowercase string (A) and you have to tell the count of vowels and consonants in it.



Problem Constraints

1 <= A.size() <= 1000



Input Format

First and only argument containing a lowercase string A.



Output Format

You have to return an array of two elements representing count of vowels and consonants in the input string respectively.



Example Input

Input 1:

interviewbit
Input 2:

scaler


Example Output

Output 1:

[5 7]
Output 2:

[2 4]


Example Explanation

Explanation 1:

Clearly, interviewbit has 4 vowels and 7 consonants.
Explanation 2:

Clearly, scaler has 2 vowels and 4 consonants. */
public class Q2AP_Beginner_Introduction_to_Strings{
    public ArrayList<Integer> solve(String A) {
        int[] arr=new int[2];
        int N=A.length();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<N;i++)
        {
            if ((A.charAt(i)=='a')||(A.charAt(i)=='A')||(A.charAt(i)=='e')||(A.charAt(i)=='E')||(A.charAt(i)=='i')||(A.charAt(i)=='I')||(A.charAt(i)=='o')||(A.charAt(i)=='O')||(A.charAt(i)=='u')||(A.charAt(i)=='U'))
                arr[0]++;
            else
                arr[1]++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        result.add(arr[1]);
                
        return result;

    }
}


import java.util.ArrayList;

