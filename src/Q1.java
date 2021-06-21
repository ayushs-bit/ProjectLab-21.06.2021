import java.util.Scanner;
public class Q1
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];

        //step 1 input
        System.out.println("Enter the element in array");
        for(int i =0;i<ar.length;i++)
        {
            ar[i] = sc.nextInt();
        }

        //step 2 process
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp = ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
        }

        //step 3 output
        System.out.println("Second Highest Element = "+ar[(ar.length - 2)]);





    }
    public static void main(String args[]) {
        Q1 obj = new Q1();
        obj.func();
    }
}
