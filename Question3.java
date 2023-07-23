/* 
Question 3: Find the count of singulars in array -

Skill Mapping: Expert

Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.

Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}

Output: Count of singular socks = 3

Explanation : Socks Id - 10: total count 4 => Two pairs of socks - no singular left

Socks Id - 20: total count 3 => One pair of socks - 1 singular left

Socks Id - 30: total count 1 => No pair of socks - 1 singular left

Socks Id - 50: total count 1 => No pair of socks - 1 singular left

So, Total number of Singular socks = 3
*/
import java.util.*;
public class Question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size : ");
        int n = sc.nextInt();
        int arrNum[] = new int[n];
        System.out.print("Array Elements are : ");
        for(int i = 0; i < n;i++){
            arrNum[i] = sc.nextInt();
        }
        Arrays.sort(arrNum);
        int count = 0;
        int singleCount = 0;
        int temp; 
        int i, j;
        for(i = 0; i < n;){
            temp = arrNum[i];
            count = 1;
            for(j = i+1; j < n; j++){
                if(temp == arrNum[j]){
                    count++;
                }else{

                    break;
                }
            }  
            i = j;
            int pair = count %2;
            singleCount = singleCount + pair; 
        }
        System.out.println("Count of singular socks = "+ singleCount);
    }
}