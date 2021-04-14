 import java.util.Scanner;

class Node
{
    int rollno;
    Node next;
}
public class SinglyLinkedList
{
    Node START;
   
    SinglyLinkedList()
    {
        START = null;
    }
    void addnode()
    {
        System.out.println("Enter you rollno");
        Scanner sc2=new Scanner(System.in);
        int rn=sc2.nextInt();
       
        Node newnode=new Node();
        newnode.rollno=rn;
        newnode.next=null;
       
        if(START==null)
        {
            START=newnode;
        }
        else
        {
            Node current=START;
            while(current.next != null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
        System.out.println("data inserted");
    }
    void deletenodebegin()
    {
        if(START==null)
        {
            System.out.println("list empty");
        }
        else
        {
            
        }
    }
    void deletelast()
    {
        if(START==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Node current=START;
            while(current.next==null)
            {
                System.out.println("delete element:"+current.rollno);
                current = null;
                
            }
        }
    }
    void traversenode()
    {
        if(START == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Node current;
            for(current = START; current!= null; current=current.next)
            {
                System.out.print(current.rollno+" ");
            }
             System.out.println();
           
        }
    }
    void searchnode()
    {
        if(START==null)
        {
            System.out.println("List Empty");
        }
        else
        {
            System.out.println("Enter searching element");
            Scanner sc3=new Scanner(System.in);
            int sea=sc3.nextInt();
           
            int count=0;
            Node current;
            for(current=START; current!=null; current=current.next)
            {
                if(current.rollno == sea)
                {
                    count++;
                    break;
                }
            }
            if(count>0)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
   
    public static void main(String[] args)
    {
        SinglyLinkedList obj=new SinglyLinkedList();
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for deletebegin");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for exit");
            System.out.println("press 6 for delete last");
           
            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
           
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.deletelast();
                    break;
                case 3:
                    obj.traversenode();
                    break;
                case 4:
                    obj.searchnode();
                    break;
                case 5:
                    System.exit(0);
                    break;
                case 6:
                    obj.deletelast();
                default:
                    System.out.println("Invalid entry");
            }
           
        }
       
    }
   
}



