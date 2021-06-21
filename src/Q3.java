import java.util.Scanner;
class Node
{
    int data;
    Node next;
}
public class Q3
{
    Node top;
    Q3()
    {
        top = null;
    }
    void push()//insert
    {
        System.out.println("Enter Data");
        Scanner sc2 = new Scanner(System.in);
        int newitem = sc2.nextInt();

        Node newnode = new Node();
        newnode.data = newitem;
        newnode.next = top;

        top = newnode;
        System.out.println("data inserted");
    }
    void pop()//delete
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("delete item : "+top.data);
            top = top.next;
        }
    }
    void peek()
    {
        if(top == null)
        {
            System.out.println("Stack Is Empty");

        }
        else
        {
            int max = 0;
            Node current;
            for(current = top;current != null;current = current.next)
            {
                if(current.data > max)
                {
                    max = current.data;
                }
            }
            System.out.println("Highest Element = " + max);
        }
    }

    void traverse()//view
    {
        if(top == null)
        {
            System.out.println("Stack Is Empty");

        }
        else
        {
            Node current;
            for(current = top;current != null;current = current.next)
            {
                System.out.print(current.data+" ");
            }
        }
    }
    public static void main(String arg[])
    {
        Q3 obj = new Q3();
        while(true)
        {
            System.out.println("\n" +
                    "press 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for peek");
            System.out.println("press 4 for traverse");
            System.out.println("press 5 for exit\n");

            System.out.println("Enter ur choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.traverse();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}