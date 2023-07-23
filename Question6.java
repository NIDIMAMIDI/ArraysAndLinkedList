/*

Question 6: Remove Duplicates from Linked-List

Skill Mapping: Intermediate

Description: Consider a Linked-List with N number of repeated integers in Data-Node.

Task - WAP in Java to remove the repeated integer numbers from Linked-List.

Sample input: Linked-List:- 2->5->12->2->3->5->1->2->5->5

Output:- 2->5->12->3->1

 */

import java.util.*;

public class Question6 {
    public static int remDuplicates(LinkedList<Integer> l1,int n)
    {
        Collections.sort(l1);
        int i=0,j=0;
        for(i=0;j<n;)
        {
            if(l1.get(i)==l1.get(j))
            {
                j++;
            }
            else{
                l1.set(++i,l1.get(j));
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the LinkedList 1 : ");
        int n = sc.nextInt();
        if(n <= 0) {
            System.out.println("Please Enter a valid Integer");
            System.exit(0);
        }
        else{
            LinkedList<Integer> l1 = new LinkedList<Integer>();
            for(int i = 0; i < n; i++){
                l1.add(sc.nextInt());
            }
            System.out.print("Linked-List:- ");
            Iterator it = l1.iterator();
            while(it.hasNext()){
                System.out.print(it.next());
                while(it.hasNext()){
                    System.out.print("->");
                    break;
                }
            }
            System.out.println();
            int res = remDuplicates(l1,n);
            for(int j=0;j<n-res-1 && res<n-1;j++)
                l1.removeLast();
            System.out.println("Output:- ");
            Iterator itr = l1.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next());
                while(itr.hasNext()){
                    System.out.print("->");
                    break;
                }
            }
        }
        
    }
}
