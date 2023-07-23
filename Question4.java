/*
 Description: Solve the HackerRank Problem given as a link below -
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int val=input.nextInt();
        int[] ar=new int[val];
        int ele=0;
        for(int n:ar){
            ar[ele++]=input.nextInt();
        }
        int sum,count=0;
        for(int i=0;i<ar.length;i++){
            sum=0;
            for(int j=i;j<ar.length;j++){
                sum+=ar[j];
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

/* */
 