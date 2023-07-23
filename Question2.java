/*
 Question 2: Find missing numbers in array -

Skill Mapping: Basic

Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

Sample input: arrNum = {1, 2, 4, 5, 6}

Output: 3

Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}

Output: 4, 7, 9, 12, 13
 */
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size : ");
        int n = sc.nextInt();
        int arrNum[] = new int[n];
        System.out.print("Array Elements are : ");
        for(int i = 0; i < n;i++){
            arrNum[i] = sc.nextInt();
        }
        int max = -1;
        for(int i = 0; i < n;i++){
            if(arrNum[i] > max) {
                max = arrNum[i];
            }
        }
        System.out.println("Missing Elements are : ");
        int flag;
        for(int i = 1; i <= max; i++){
            flag = 0;
            for(int j = 0; j < n; j++){
                if(i == arrNum[j]){
                    flag = flag + 1;
                }
            }
            if(flag == 0){
                System.out.println(i);
            }
        }
    }
}
