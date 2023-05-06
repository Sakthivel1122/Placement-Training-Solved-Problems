import java.util.*;
public class Problem3
{
    public static void main(String args[])
	{
        ArrayList<Integer> arrlst1 = new ArrayList<>();
        ArrayList<Integer> arrlst2 = new ArrayList<>();
        int n,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements in arraylist1:");
        n = sc.nextInt();
        System.out.println("Enter elements in arraylist1:");
        while(n-->0)
		{
            x = sc.nextInt();
            arrlst1.add(x);
        }
        System.out.println("Number of elements in arraylist2:");
        n = sc.nextInt();
        System.out.println("Enter elements in arraylist2:");
        while(n-->0)
		{
            x = sc.nextInt();
            arrlst2.add(x);
        }
        System.out.println("Before Joining:");
        System.out.println(arrlst1);
        System.out.println(arrlst2);
        arrlst1.addAll(arrlst2);
        System.out.println("After Joining:");
        System.out.println(arrlst1);
        sc.close();
    }
}