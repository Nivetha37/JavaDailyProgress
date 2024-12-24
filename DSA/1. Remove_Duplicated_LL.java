/*You are given head of the non-empty sorted linked list where the value of the ith node will be Ai.

Your task is to delete all duplicates such that each element appears only once and return the linked list sorted.*/

import java.util.*;

public class Main{

  // NODE STRUCTURE DEFINITION
    
    static class Node{
    int data;
    Node next;
    Node(int x ){
        data = x;
        next = null;
    }
}


// REMOVE DUPLICATES
  
public static Node removeDuplicates(Node head){
    if(head == null || head.next == null) return head;
    
    Node prev = head;
    Node curr = prev.next;
    
    while(prev!=null){
        while(curr!=null && prev.data == curr.data){
            curr = curr.next;
        }
        prev.next = curr;
        prev = prev.next;
        if(prev!=null){
            curr = prev.next;
        }
    }
    return head;
}


//PRINT LINKEDLIST
  
public static void print(Node head){
    
    while(head!=null){
        System.out.print(head.data+" ");
        head = head.next;
        
    }
    System.out.println();
}

  //MAIN METHOD
  
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        while(t-->0){
            int n = m.nextInt();
            Node head = null,tail = null;
            for(int i=0;i<n;i++){
               Node newnode = new Node(m.nextInt()); 
               if(head==null){
                   head = newnode;
                   tail = newnode;
               }
               else{
                   tail.next = newnode;
                   tail = newnode;
               }
            }
            
            Node updated = removeDuplicates(head);
            print(updated);
        }
    }
}
