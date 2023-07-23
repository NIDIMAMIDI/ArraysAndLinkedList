/*
Merge and Sort the elements in two Linked-List

Skill Mapping: Intermediate

Description: Consider two Linked-List with N number of integers in Data-Node respectively.

Task 1- WAP in Java to merge both Linked-Lists.

Task 2 - Sort the output Linked-List basis of its Data-Node in ascending order.

Sample input: Linked-List-1:- 25->35->12->4->36->48

Linked-List-2:- 8->32->22->45->63->49

Output:- 4->8->12->22->25->32->35->36->45->48->49->63
*/
import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the LinkedList 1 : ");
        int n = sc.nextInt();
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        for(int i = 0; i < n; i++){
            l1.add(sc.nextInt());
        } 
        System.out.print("Linked-List-1:- ");
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
            while(it.hasNext()){
                System.out.print("->");
                break;
            }
        }
        System.out.println();
        System.out.print("Enter the size of the LinkedList 2 : ");
        int m = sc.nextInt();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        for(int i = 0; i < m; i++){
            l2.add(sc.nextInt());
        }
        System.out.print("Linked-List-2:- ");
        Iterator ite = l2.iterator();
        while(ite.hasNext()){
            System.out.print(ite.next());
            while(ite.hasNext()){
                System.out.print("->");
                break;
            }
        }
        System.out.println();
        l1.addAll(l2);
        Collections.sort(l1);
        System.out.print("Output:- ");
        Iterator iter = l1.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next());
            while(iter.hasNext()){
                System.out.print("->");
                break;
            }
        }
    }
}
