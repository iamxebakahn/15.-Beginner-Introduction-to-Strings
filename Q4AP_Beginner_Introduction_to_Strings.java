/*Problem Description

You're given strings A representing the types of stones that are jewels, and B representing the stones you have. Each character in B is a type of stone you have. You want to know how many of the stones you have that are also jewels.

Note : Letters are case sensitive, so "a" is considered a different type of stone from "A".


Problem Constraints

1 <= A.length, B.length <= 50
A and B consist of only English letters
All the characters of A are unique.


Input Format

String A
String B


Output Format

Return the number of stones you have that are also jewels


Example Input

Input 1 :
A = "aA", B = "aAAbbbb"
Input 2 :
A = "z", B = "ZZ"


Example Output

Output 1 :
3
Output 2 :
0


Example Explanation

For Input 1 :
Jewels = ['a' , 'A'].
We have Stones ['a', 'A', 'A'] which are also jewels. So the answer is 3 
For Input 2 :
We don't have any stone which is also a jewel 'z'.  */
public class Q4AP_Beginner_Introduction_to_Strings{
    public int jewelCount(String A, String B) {
        int jewel=0;
        for(int i=0;i<B.length();i++)
        {
            for(int j=0;j<A.length();j++)
            {
                if(B.charAt(i)==A.charAt(j))
                    {
                        jewel++;
                        break;
                    }
            }
        }

        return jewel;
    }
}
