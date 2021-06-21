import java.util.Scanner;
public class Q2
{
    int[] ar;
    int top;
    Q2()
    {
        ar=new int[5];
        top=-1;
    }
    void push()//insert
    {
        if(top==4)
        {
            System.out.println("Stack is full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            top = top +1 ;
            ar[top] = data;
            System.out.println("Data inserted....");
        }
    }
    void pop()//delete
    {
        if(top == -1)
        {
            System.out.println("Stack is already empty");
        }
        else
        {
            System.out.println("Element deleted ="+ar[top]);
            top = top-1;
        }
    }
    void peek()
    {
        if(top == -1)
        {
            System.out.println("Array Empty");
        }
        else
        {
            System.out.println("peek element = " + ar[top]);
        }
    }
    void traverse()//view
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.print(ar[i]+" ");
            }
        }
    }
    public static void main(String[] arg)
    {
        Q2 obj = new Q2();
        while(true)
        {
            System.out.println("\npress 1 for push");
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
