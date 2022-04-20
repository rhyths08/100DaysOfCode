import java.util.Scanner;

public class search_where_adjecentk 
{
    static int search(int a[], int n, int k, int x)
    {
        int index=60;
        for(int i=0;i<n;)
        {
            if(a[i]==x)
            {
                index=i;
                break;
            }
            i = i + Math.max(1, Math.abs(a[i]- x) / k);
        }
        return index;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();
        sc.close();
        int index=search(a,n,k,x);
        System.out.println("Element "+x+" is present at index: "+index);
    }
}
